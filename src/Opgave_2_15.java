import java.util.Scanner;

// Lavet af Erik Ruhmanis

public class Opgave_2_15 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om x1 og y1
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        //Spørger om x2 og y2
        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Beregner distancen
        double result = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        //Printer resultatet
        System.out.println("The distance between the two points is " + result);
    }

}
