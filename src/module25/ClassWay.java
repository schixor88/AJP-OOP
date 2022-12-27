package module25;

public class ClassWay extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Running ... ");
    }

    public static void main(String[] args) {
        ClassWay classWay = new ClassWay();
        classWay.start();
    }
}
