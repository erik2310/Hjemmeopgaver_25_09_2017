import java.util.Scanner;

public class Opgave_2_8 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om time zone offset
        System.out.print("Enter the time zone offset to GMT: ");
        int timezoneoffset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24 + timezoneoffset;

        // Display results
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

}
