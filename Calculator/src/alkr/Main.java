package alkr;
import calc.Calculator;

public class Main {

    public static void main(String[] args) {
	    Calculator calc = new Calculator("Calculator");
        System.out.println(calc.add(5,6));
        System.out.println(calc.sub(5,6));
        System.out.println(calc.multi(5,6));
        System.out.println(calc.divide(5,6));
        System.out.println(calc.divide(12,2));
        System.out.println(calc.divide(12,2.));
        System.out.println(calc.divide(5,0));
        System.out.println(calc.divide(5,0.));
    }
}
