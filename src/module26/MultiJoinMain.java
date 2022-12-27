package module26;

public class MultiJoinMain {

    public static void main(String[] args) {

        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");
        NewThread t4 = new NewThread("Four");

        System.out.println(t1.t.getName() + " is alive: "+ t1.t.isAlive());
        System.out.println(t2.t.getName() + " is alive: "+ t2.t.isAlive());
        System.out.println(t3.t.getName() + " is alive: "+ t3.t.isAlive());
        System.out.println(t4.t.getName() + " is alive: "+ t4.t.isAlive());

        //join to wait for thread to finish

        try{
            System.out.println("Waiting for threads to finish");
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println(t1.t.getName() + " is alive: "+ t1.t.isAlive());
        System.out.println(t2.t.getName() + " is alive: "+ t2.t.isAlive());
        System.out.println(t3.t.getName() + " is alive: "+ t3.t.isAlive());
        System.out.println(t4.t.getName() + " is alive: "+ t4.t.isAlive());


        System.out.println("\nMain Thread Exiting");
    }
}
