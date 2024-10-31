// calander class is a abstract class
import java.util.Calendar;

class CalendarExample {
    public static void main(String[] args) {
        // Get an instance of the Calendar class
        Calendar calendar = Calendar.getInstance();

        // Display the current date and time
        System.out.println("Current Date and Time:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Months are 0-based, so add 1
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));

        // Add 10 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("\nDate after adding 10 days:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        // Subtract 2 months from the current date
        calendar.add(Calendar.MONTH, -2);
        System.out.println("\nDate after subtracting 2 months:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        // Set a specific date (e.g., 25th December 2024)
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println("\nSpecific Date Set:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        /* O/P:
         Current Date and Time:
Year: 2024
Month: 10
Day: 31
Hour: 11
Minute: 38
Second: 32

Date after adding 10 days:
Year: 2024
Month: 11
Day: 10

Date after subtracting 2 months:
Year: 2024
Month: 9
Day: 10

Specific Date Set:
Year: 2024
Month: 12
Day: 25
PS D:\java_practical\Date_time> 
*/
    }
}
