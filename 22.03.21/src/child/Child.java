package child;

import parent.Parent;

public class Child extends Parent {

    private int fieldOne;
    private int fieldTwo;

    public Child(int first, int second) { super(first, second); }

    @Override
    public int getFieldOne() { return super.getFieldOne(); }
}
