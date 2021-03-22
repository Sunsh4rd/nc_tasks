package alkr;

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent(3, 8);
        Child c = new Child(11, 1);

        System.out.println(p.getFieldOne());
        System.out.println(p.getFieldTwo());
        System.out.println(c.getFieldOne());
        System.out.println(c.getFieldTwo());
    }
}

class Parent {

    private int fieldOne;
    private int fieldTwo;

    public Parent(int first, int second) {
        this.fieldOne = first;
        this.fieldTwo = second;
    }

    public int getFieldOne() {
        return this.fieldOne;
    }

    public int getFieldTwo() {
        return this.fieldTwo;
    }
}

class Child extends Parent {

    private int fieldOne;
    private int fieldTwo;

    public Child(int first, int second) {
        super(first, second);
    }

    @Override
    public int getFieldOne() {
        return this.fieldOne;
    }
}