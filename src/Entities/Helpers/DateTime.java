package Entities.Helpers;

public class DateTime extends Date{
    private int hours;
    private int minutes;
    private int seconds;

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        super(day, month, year);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%d-%d-%d %d:%d:%d", this.getDay(), this.getMonth(), this.getYear(), hours, minutes, seconds);
    }
}
