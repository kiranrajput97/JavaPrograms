//create a method to check if the number is increasing number 

import java.util.Scanner;
 
public class checkNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int previousDigit = 9;
        boolean increasingNumber = true;
        while (n > 0) {
            int currentDigit = n % 10;
            n = n / 10;
            if (currentDigit > previousDigit) {
                increasingNumber = false;
                break;
            }
            previousDigit = currentDigit;
        }
        System.out.println("Increasing number = " + increasingNumber);
    }
}