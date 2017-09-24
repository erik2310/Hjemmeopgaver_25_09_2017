import java.util.Scanner;

public class Opgave_2_3 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om meter
        System.out.print("Enter a value for meter: ");
        double typedmeter = input.nextDouble();

        //Udregner det til feet
        double result = typedmeter * 3.2786;

        //Printer resultatet ud
        System.out.println(typedmeter + " meters is " + result + " feet" );

    }

}
