package module25;

public class ThreadExampleMain {
    public static void main(String[] args) {
        new MyThreadExample();
        try {
            for(int i = 6;i>0;i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(
                        1000
                );
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Exiting");
        }
    }
}
