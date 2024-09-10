public class DateFormatter {

	public static void main(String[] args) {
		// Array of dates in "month/day/year" format
		String[] dates = {
				"10/29/99", "12/5/01", "1/15/20", "7/4/21", "3/14/15",
				"11/11/11", "2/28/22", "8/8/88", "6/1/10", "9/30/99"
		};

		// Month names array
		String[] months = {
				"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};

		// Process each date and print in the required format
		for (String date : dates) {
			// Split the date into month, day, and year
			String[] parts = date.split("/");
			int month = Integer.parseInt(parts[0]);
			int day = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);

			// Convert two-digit year to four-digit year
			year = (year < 50) ? 2000 + year : 1900 + year;

			// Determine the day suffix (st, nd, rd, th)
			String daySuffix;
			if (day >= 11 && day <= 13) {
				daySuffix = "th";
			} else {
				switch (day % 10) {
					case 1:  daySuffix = "st"; break;
					case 2:  daySuffix = "nd"; break;
					case 3:  daySuffix = "rd"; break;
					default: daySuffix = "th"; break;
				}
			}

			// Print the formatted date
			System.out.println(day + daySuffix + " " + months[month - 1] + " " + year);
		}
	}
}
