package module5;

public class SajhaYatayat extends FactoryBus{

    SajhaYatayat(){

    }

    SajhaYatayat(int capacity){
        this.capacity = capacity;
    }

    @Override
    void color() {
        System.out.println("Green Sajha Color");
    }

    void minimumCharge(){
        System.out.println("Minimum Charge is Rs. 17");
    }

    void capacity(){
        System.out.printf("Capacity is: %d",capacity);
    }
}
