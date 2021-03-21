package calc;

public class Calculator {

    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int divide(int a, int b) {
        return divideInternal(a,b);
    }

    private int divideInternal(int a, int b) {
        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("a = " + a + "b = " + b + " " + e.getMessage());
            return Integer.MAX_VALUE;
        }
    }
}
