import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HW13 {

    public static final int CARS_COUNT = 6;
    private static ExecutorService executorService = Executors.newFixedThreadPool(CARS_COUNT);
    public static final AtomicInteger finishCount = new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT + 1,
                ()-> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!"));
        CountDownLatch cdl = new CountDownLatch(CARS_COUNT);

        Race race = new Race(new Road(60), new Tunnel(30));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl, finishCount);
        }

        for (int i = 0; i < cars.length; i++) {
            executorService.execute(cars[i]);
        }

        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            executorService.shutdown();
        }
    }
}

class Car implements Runnable {

    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private CyclicBarrier cb;
    private CountDownLatch cdl;
    private AtomicInteger finishCount;
    private String name;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cdl, AtomicInteger finishCount) {
        this.race = race;
        this.speed = speed;
        this.cb = cb;
        this.cdl = cdl;
        this.finishCount = finishCount;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        cdl.countDown();

        int finishPlace = finishCount.incrementAndGet();

        if (finishPlace == 1) {
            System.out.println(this.name + " ПОБЕДИЛ В ГОНКЕ!!!");
        } else {
            System.out.printf("%s занял %d место%n", this.name, finishPlace);
        }
    }
}

abstract class Stage {

    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}

class Road extends Stage {

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(c.getName() + " закончил этап: " + description);
        }
    }
}

class Tunnel extends Stage {

    static Semaphore semaphore;

    Tunnel(int length) {
        this.length = length;
        this.description = "Тоннель " + this.length + " метров";
    }

    static {
        semaphore = new Semaphore(HW13.CARS_COUNT / 2);
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
            semaphore.acquire();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(c.getName() + " закончил этап: " + description);
        }
    }
}

class Race {
    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() {
        return stages;
    }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}