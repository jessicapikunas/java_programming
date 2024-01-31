import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main (String[] args){
        System.out.println("Please enter temp in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double cel = scanner.nextDouble();

        double fahr = (9/5.0) * cel + 32;
        System.out.println("value in fahr: " + fahr);
    }
}
