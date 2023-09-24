public class Monthly extends Appt {
    public Monthly(int day, int month, int year, String desc) {
        super(day, month, year, desc);
    }

    @Override
    public boolean occursOn(int day, int month, int year) {
        // Implement logic to check if this is a monthly appointment
        return (this.day == day && this.month == month);
    }
}