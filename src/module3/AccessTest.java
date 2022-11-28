package module3;

public class AccessTest {
    public static void main(String[] args){
        TimeOne time1 = new TimeOne();
//        time1.hour = 7; // error due to private
//        time1.minute = 12; // error due to private
        time1.second = 12;

    }
}
