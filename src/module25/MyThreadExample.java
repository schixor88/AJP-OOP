package module25;

public class MyThreadExample implements Runnable {

    Thread t2;

    MyThreadExample(){
        t2 = new Thread(this, "Demo Thread");
        System.out.println("Child Thread");
        t2.start();
    }

    @Override
    public void run() {
        for(int i = 7;i>0;i--){
            System.out.println("Child Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Exiting");
            }
        }
    }
}
