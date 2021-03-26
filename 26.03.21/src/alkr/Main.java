package alkr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Fruit[] fruits = { new Apple(), new Apple(), new Orange() };
        Basket<Fruit> basket = new Basket<>(fruits);
        basket.put(new Apple());
        basket.put(new Orange());
        basket.put(new Orange());
        basket.put(new Orange());
        Fruit[] items = basket.get();
        int c = items.length;
        System.out.println(c);
        int weight = 0;
        for (Fruit item : items) {
            System.out.println(item.toString());
            weight += item.getSize();
        }
        System.out.println(weight);
    }
}

class Basket<T> {

    private T[] items;
    private int count;

    public Basket(T[] items) {

        this.items = Arrays.copyOf(items, items.length);
        this.count = items.length;
    }

    public void put(T item) {

        this.items = Arrays.copyOf(this.items, this.count + 1);
        this.items[count++] = item;
    }

    public T[] get() {
        return Arrays.copyOf(this.items, items.length);
    }
}

class Fruit {

    public int getSize() {
        return 0;
    }
}

class Apple extends Fruit {

    @Override
    public String toString() { return "Apple"; }

    @Override
    public int getSize() {
        return 1;
    }
}

class Orange extends Fruit {

    @Override
    public String toString() { return "Orange"; }

    @Override
    public int getSize() {
        return 2;
    }
}