package module3;

public class TimeTwo {
    private int hour;
    private int minute;
    private int second;

    public TimeTwo(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 59) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 59) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeTwo(int hour) {
        this(hour, 0, 0);
    }

    public TimeTwo(int hour, int minute) {
        this(hour, minute, 0);
    }
}
