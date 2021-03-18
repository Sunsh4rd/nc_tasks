package calc;

public class Calculator {

    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public String getName() {
        return name;
    }
}