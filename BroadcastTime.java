package ru.relex.Test_6_CW;

class BroadcastTime implements Comparable<BroadcastTime> {
    private byte hour;
    private byte minute;

    public BroadcastTime(byte hour, byte minute) {
        this.hour = hour;
        this.minute = minute;
    }
    BroadcastTime(String time){
        String[] curTime = time.split(":");
        this.hour = Byte.parseByte(curTime[0]);
        this.minute = Byte.parseByte(curTime[1]);
    }

    public byte hour() {
        return hour;
    }

    public byte minutes() {
        return minute;
    }

    @Override
    public int compareTo(BroadcastTime other) {
        if (this.hour!= other.hour) {
            return Byte.compare(this.hour, other.hour);
        } else {
            return Byte.compare(this.minute, other.minute);
        }
    }

    public boolean after(BroadcastTime t) {
        return this.compareTo(t) > 0;
    }

    public boolean before(BroadcastTime t) {
        return this.compareTo(t) < 0;
    }

    public boolean between(BroadcastTime t1, BroadcastTime t2) {
        return (!before(t1)) && (!after(t2));
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}