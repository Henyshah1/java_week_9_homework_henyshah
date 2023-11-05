package calculate;

import java.util.Scanner;

public class Main {
    //Main Method
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char continueCalculation = 'Y';
        //While loop
        while (continueCalculation == 'Y') {
            System.out.print("Enter first Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second Number: ");
            int num2 = scanner.nextInt();

            System.out.print("Please enter one of symbol +, -, *, /: ");
            char operation = scanner.next().charAt(0);

            calculator.calculateResult(num1, num2, operation);

            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().charAt(0);
        }
        //Scanner close
        scanner.close();
    }
}
