package Les;

public class Les13 {
    public static void main(String[] args) {
        Les13 sp = new Les13();
        sp.run();

    }

    private void run() {
        StoppableThread t = new StoppableThread();
        Thread thread = new Thread(t);
        thread.start();
        try {
            //работа
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.disable();
    }
}

class StoppableThread implements Runnable{

    private boolean active = true;

    public void disable(){
        active = false;
    }
    @Override
    public void run() {
        int count = 0;
        while (active){
            System.out.println(count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
