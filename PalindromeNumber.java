import java.util.Scanner;

public class PalindromeNumber {
    public static void main (String[] args){
        System.out.println("Enter a three-digit number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int num1 = (int)(number / 100);
        int remaining = number % 100;
        int num3 = (int)(remaining % 10);

        System.out.println(number + ((num1 == num3) ? " is a " : " is not a ") + "palindrome");

    }
}
