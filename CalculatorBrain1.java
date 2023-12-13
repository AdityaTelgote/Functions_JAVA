/*Question
 * Using Eclipse to Create a new Java class that will have the following functionality:
A)Name should be CalculatorBrain
B)Implement a function for each aritmetic operation
1)Addition
2)Subtraction
3)Multiplication
4)Division
5)Square Root
6)Power Of
Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.
 * 
 */
package Aditya;

public class CalculatorBrain1 {
    // Method to perform addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to calculate square root
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root of a negative number is undefined");
        }
        return Math.sqrt(number);
    }

    // Method to calculate power of a number
    public double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Sample usage in main method
    public static void main(String[] args) {
        CalculatorBrain1 calculator = new CalculatorBrain1();

        // Perform addition
        double additionResult = calculator.add(5, 3);
        System.out.println("5 + 3 = " + additionResult);

        // Perform subtraction
        double subtractionResult = calculator.subtract(10, 2);
        System.out.println("10 - 2 = " + subtractionResult);

        // Perform multiplication
        double multiplicationResult = calculator.multiply(4, 2);
        System.out.println("4 * 2 = " + multiplicationResult);

        // Perform division
        double divisionResult = calculator.divide(64, 8);
        System.out.println("64 / 8 = " + divisionResult);

        // Calculate square root
        double number = 64;
        double sqrtResult = calculator.squareRoot(number);
        System.out.println("Square root of " + number + " is: " + sqrtResult);

        // Calculate power of a number
        double base = 2;
        double exponent = 3;
        double powerResult = calculator.powerOf(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
    }
}
