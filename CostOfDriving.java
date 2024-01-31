import java.util.Scanner;

public class CostOfDriving {
    public static void main (String[] args){
        System.out.println("Enter the driving distance: "); // gets user input for driving dist
        Scanner scanner = new Scanner(System.in);
        double dist = scanner.nextDouble();

        System.out.println("Enter miles per gallon: "); // gets user input for mpg
        scanner = new Scanner(System.in);
        double mpg = scanner.nextDouble();

        System.out.println("Enter price per gallon: "); // gets user input for price per gal
        scanner = new Scanner(System.in);
        double ppg = scanner.nextDouble();

        System.out.println("The cost of driving is: " + ppg * mpg * 1.385); // outputs cost of trip
    }
}
