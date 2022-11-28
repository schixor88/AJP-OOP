package module4;

public class Parent {

    int p;

    Parent(){
        System.out.println("Parent Constructor");
    }
    Parent(int p1){
        System.out.println("Parent Parametrized Constructor: "+p1);
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        System.out.println("Setting P in Parent");
        this.p = p;
    }

    public void printValue(){
        System.out.println("Parent Method");
    }
}
