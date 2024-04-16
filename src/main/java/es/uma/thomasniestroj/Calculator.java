package es.uma.thomasniestroj;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }
}
