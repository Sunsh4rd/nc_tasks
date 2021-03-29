package alkr;

public class Main {

    public static void main(String[] args) {

        GenericClass gen = new GenericClass(1, "ABABAB", false);
        System.out.println(gen.gettTypeVariable());
        System.out.println(gen.getvTypeVariable());
        System.out.println(gen.getkTypeVariable());

        gen.names();
    }
}

class GenericClass<T, V, K> {

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