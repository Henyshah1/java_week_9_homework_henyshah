package calculate;

public class Calculator {
    //Addition method
    public void addition(int a, int b) {
        System.out.println("Addition Result: " + (a + b));
    }
    //Subtraction method
    public void subtraction(int a, int b) {
        System.out.println("Subtraction Result: " + (a - b));
    }
    //Multiplication method
    public void multiplication(int a, int b) {
        System.out.println("Multiplication Result: " + (a * b));
    }
    //Division method
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division Result: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    //Result calculation method
    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid symbol. Please use +, -, *, or / for calculation.");
        }
    }
}
