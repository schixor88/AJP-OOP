package module5;

public class MainFive {
    public static void main(String[] args) {
        FactoryBus bus = new FactoryBus();
        bus.engineCheck();
        bus.applyBrake();
        System.out.println("----");
        NepalYatayat ny = new NepalYatayat();
        ny.name = "Nepal Yatayat";
        ny.engineCheck();
        ny.applyBrake();
        ny.minimumCharge();
        ny.capacity(27);
        ny.color();

        System.out.println("----");

        SajhaYatayat sj = new SajhaYatayat(30);
        sj.name = "Sajha Yatayat";
        sj.engineCheck();
        sj.applyBrake();
        sj.minimumCharge();
        sj.capacity();
        sj.color();
    }
}
