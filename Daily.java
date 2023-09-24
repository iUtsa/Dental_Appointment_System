public class Daily extends Appt {
    public Daily(int day, int month, int year, String desc) {
        super(day, month, year, desc);
    }

    @Override
    public boolean occursOn(int day, int month, int year) {
        // Implement logic to check if this is a daily appointment
        return true; // Daily appointments occur every day
    }
}