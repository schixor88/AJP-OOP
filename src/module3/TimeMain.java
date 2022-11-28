package module3;

public class TimeMain {
    public static void main(String args[]) {
        TimeOne time1 = new TimeOne();
        time1.setTime(3, 10, 22);
        //
        try {
            time1.setTime(13, 11, 22);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After invalid values",time1);
    }

    private static void displayTime(String header, TimeOne t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
