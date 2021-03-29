package alkr;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();
        ArrayList<Integer> i = new ArrayList<>();
        ArrayList<Cat> c = new ArrayList<>();

        System.out.println(s.getClass());
        System.out.println(i.getClass());
        System.out.println(c.getClass());

        System.out.println(s.getClass().equals(c.getClass()));

//        GenericClass gen = new GenericClass(1, "ABABAB", 10.4);
//        System.out.println(gen.gettTypeVariable());
//        System.out.println(gen.getvTypeVariable());
//        System.out.println(gen.getkTypeVariable());
//
//        gen.names();
    }
}

class Cat { }

class GenericClass<T extends Comparable, V extends Serializable, K extends Number> {

    private T tTypeVariable;
    private V vTypeVariable;
    private K kTypeVariable;

    public GenericClass(T tTypeVariable, V vTypeVariable, K kTypeVariable) {
        this.tTypeVariable = tTypeVariable;
        this.vTypeVariable = vTypeVariable;
        this.kTypeVariable = kTypeVariable;
    }

    public T gettTypeVariable() {
        return tTypeVariable;
    }

    public V getvTypeVariable() {
        return vTypeVariable;
    }

    public K getkTypeVariable() {
        return kTypeVariable;
    }

    public void names() {
        System.out.println(tTypeVariable.getClass());
        System.out.println(vTypeVariable.getClass());
        System.out.println(kTypeVariable.getClass());
    }
}