package module5;
public class NepalYatayat extends FactoryBus{
    NepalYatayat(){
//        super();
    }
    @Override
    void color() {
//        super.color();
        System.out.println("Ny Color");
    }
    void capacity(int capacityInput){
        capacity = capacityInput;
        System.out.printf("Bus capacity is: %d",capacityInput);
    }

    void minimumCharge(){
        System.out.println("Minimum Charge is Rs.20");
    }
}
