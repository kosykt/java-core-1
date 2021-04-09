package Les;

public class Les13 {
    public static void main(String[] args) {
        Les13 sp = new Les13();
        sp.run();
    }

    private void run() {
        InterruptdThread interruptdThread = new InterruptdThread();
        interruptdThread.start();
        try {
            Thread.sleep(50);
            interruptdThread.interrupt();
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class InterruptdThread extends Thread{
    @Override
    public void run() {
        int count = 0;
        while (!isInterrupted()){
            System.out.println(count++);
        }
    }
}