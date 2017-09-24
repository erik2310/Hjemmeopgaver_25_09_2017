import java.util.Scanner;

public class Opgave_2_11 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om antal år
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        //Beregner tallet med numberofyears
        int result = 65186594 * numberOfYears;

        System.out.println("The population in " + numberOfYears + " years is " + result);

    }

}
