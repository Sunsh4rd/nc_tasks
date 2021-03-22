public class Main {

    Parent p = new Parent(3, 8);
    Child c = new Child(3,8);

    

}

class Parent {

    private int fieldOne;
    private int fieldTwo;

    public Parent(int first, int second) {
        this.fieldOne = first;
        this.fieldTwo = second;
    }

    public int getFieldOne() {
        return fieldOne;
    }

    public int getFieldTwo() {
        return fieldTwo;
    }
}

class Child extends Parent {

    private int fieldOne;
    private int fieldTwo;

    public Child(int first, int second, int fieldOne) {
        this.fieldOne = fieldOne;
        this.fieldTwo = second;
    }

    @java.lang.Override
    public int getFieldOne() {
        System.out.println(super.getFieldTwo());
        return fieldOne;
    }


}