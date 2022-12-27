package module26;

public class MultiThreadMain {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
