public class OneTime extends Appt {
    public OneTime(int day, int month, int year, String desc) {
        super(day, month, year, desc);
    }

    @Override
    public boolean occursOn(int day, int month, int year) {
        // Implement logic to check if this is a one-time appointment
        return (this.day == day && this.month == month && this.year == year);
    }
}