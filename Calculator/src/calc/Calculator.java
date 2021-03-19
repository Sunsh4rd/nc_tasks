package calc;

public class Calculator {

    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        System.out.println(this.name);
        return a + b;
    }
}
