import java.util.Scanner;

public class Opgave_2_1 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om miles og gemmer dem i typedmiles
        System.out.print("Enter miles: ");
        double typedmiles = input.nextDouble();

        //Regner det om til kilometer
        double result = typedmiles * 1.6;

        //Printer resultatet ud
        System.out.println(typedmiles + " miles is " + result + " kilometres");
    }
}
