package tech.angelofdiasg.calculadora;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public float sum(float a, float b){
        return a + b;
    }

    public float subtraction(float a, float b){
        return a - b;
    }

    public int power(int base, int power){
        if(power == 0){
            return 1;
        }
        return power(base, power - 1) * base;
    }
    public float division(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        return Math.sqrt(a);
    }
    public double average(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public double maximum(double[] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public double minimum(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

}

