package alkr;
import calc.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator("Calculator");
        System.out.println(calc.getName() + ' ' + calc.add(5,10));
    }
}
