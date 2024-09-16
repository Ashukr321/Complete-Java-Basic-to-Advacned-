import java.util.Calendar;

public class _1_Example {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) + 1;
		int day = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println(c1.getTime());
		System.out.println("Today's date is: " + year + "-" + month + "-" + day);
		System.out.println(Calendar.SECOND);
	}
}