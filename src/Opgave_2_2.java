import java.util.Scanner;

public class Opgave_2_2 {

    public static void main(String[] args) {
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        //Spørger om side længder og gemmer dem i variablen
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double lenghtOfSides = input.nextDouble();

        //Udregner area og volume
        double area = Math.sqrt(3) / 4 * lenghtOfSides * lenghtOfSides;
        double volume = area * lenghtOfSides;

        //Printer ud hvad area og volume er
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);

    }

}
