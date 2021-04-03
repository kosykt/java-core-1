public class Les12_2 {

    public static void main(String[] args) {
        House house = new House();
        PizzaDelivery delivery = new PizzaDelivery(house);
        PizzaEater eater = new PizzaEater(house);
        delivery.start();
        eater.start();
    }
}

class House{
    private boolean pizzaArrived = false;

    public boolean isPizzaArrived() {
        return pizzaArrived;
    }

    public void arrived(){
        System.out.println("Доставлена");
        pizzaArrived = true;
    }
}

class PizzaDelivery extends Thread{
    private final House house;

    PizzaDelivery(House house){
        this.house = house;
    }

    @Override
    public void run() {
        synchronized (house){
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
            house.arrived();
//            house.notifyAll();
        }
    }
}

class PizzaEater extends Thread{
    private final House house;

    PizzaEater(House house){
        this.house = house;
    }

    @Override
    public void run() {
        synchronized (house){
            while (!house.isPizzaArrived()){
                System.out.println("Подождем");
                try {
                    house.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Ем");
        }
    }
}