import java.util.Scanner;

// Lavet af Erik Ruhmanis

public class Opgave_2_3 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om meter
        System.out.print("Enter a value for meter: ");
        double typedMeter = input.nextDouble();

        //Udregner det til feet
        double result = typedMeter * 3.2786;

        //Printer resultatet ud
        System.out.println(typedMeter + " meters is " + result + " feet");

    }

}
