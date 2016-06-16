package pl.com.czarodziejka.czarodziejka.client.pages.main;

/**
 *
 * @author Administrator
 */
public class Time {

    private int hour, minute;

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
