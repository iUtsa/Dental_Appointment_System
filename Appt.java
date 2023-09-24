public abstract class Appt {
    protected int day;
    protected int month;
    protected int year;
    protected String desc;

    public Appt(int day, int month, int year, String desc) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.desc = desc;
    }

    public abstract boolean occursOn(int day, int month, int year);

    public String getDesc() {
        return desc;
    }
}