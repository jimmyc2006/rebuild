import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        c.setFirstDayOfWeek(Calendar.MONDAY);
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
    }
}
