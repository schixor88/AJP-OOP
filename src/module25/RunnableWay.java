package module25;

public class RunnableWay implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
       Thread thread = new Thread(new RunnableWay());
       thread.start();
    }
}
