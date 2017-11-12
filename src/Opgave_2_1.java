import java.util.Scanner;

// Lavet af Erik Ruhmanis

public class Opgave_2_1 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om miles og gemmer dem i typedMiles
        System.out.print("Enter miles: ");
        double typedMiles = input.nextDouble();

        //Regner det om til kilometer
        double result = typedMiles * 1.6;

        //Printer resultatet ud
        System.out.println(typedMiles + " miles is " + result + " kilometres");
    }
}
