package module1;

public class StudentMain {
    public static void main(String[] args) {

        //create a student object for constructor demo
        Student hari = new Student(
                1,
                "Hari",
                "9876543210",
                87.2
        );

        //show result
        System.out.println(hari.toString());



        //create another student object
        Student sita = new Student(
                1,
                "Sita",
                "9845654455",
                91.8
        );

        System.out.println(sita.toString());

        Student higher;

        higher = (sita.getPercentage()>=hari.getPercentage()) ? sita : hari;

        System.out.printf("Student with higher percentage is: %s",higher.getName());
    }
}
