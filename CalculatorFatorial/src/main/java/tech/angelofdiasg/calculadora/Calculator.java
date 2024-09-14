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
        if(power <= 1){
            return 1;
        }
        return power(base * base, power - 1);
    }

}

