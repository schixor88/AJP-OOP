package module1;

public class Student {
    private int id;
    private String name;
    private String contact;
    private double percentage;


    //default constructor
    public Student() {

    }

    // alt + insert

    // parametrized constructor
    public Student(int id, String name, String contact, double percentage) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.percentage = percentage;
    }

    //to access private variables
    // getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }



    // alt+ins = toString()
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
