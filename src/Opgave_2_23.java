import java.util.Scanner;

public class Opgave_2_23 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om driving distance
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();

        //Spørger om miles per gallon
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        //Spørger om price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        //Beregner prisen
        double result = drivingDistance / milesPerGallon * pricePerGallon;

        //Printer prisen ud
        System.out.println("The cost of driving is $" + result);

    }

}
