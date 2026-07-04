package projectoop;

public class MyTime {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            IO.println("Yaroqsiz soat, daqiqa yo saniya!");
        }
    }

    public int getHour() { return this.hour; }
    public int getMinute() { return this.minute; }
    public int getSecond() { return this.second; }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) this.hour = hour;
        else IO.println("Yaroqsiz soat!");
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) this.minute = minute;
        else IO.println("Yaroqsiz daqiqa!");
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) this.second = second;
        else IO.println("Yaroqsiz saniya!");
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public String toAmPmString() {
        String marker = (this.hour >= 12) ? "PM" : "AM";
        int displayHour = this.hour % 12;
        if (displayHour == 0) {
            displayHour = 12;
        }
        return String.format("%02d:%02d:%02d", displayHour, this.minute, this.second, marker);
    }

    public MyTime nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.minute = 0;
            this.nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second--;
        if (this.second == -1) {
            this.second = 59;
            this.previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        this.minute--;
        if (this.minute == -1) {
            this.minute = 59;
            this.previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour--;
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }
}
