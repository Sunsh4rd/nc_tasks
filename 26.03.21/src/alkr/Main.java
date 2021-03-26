package alkr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Fruit[] fruits = { new Apple(), new Apple(), new Orange() };
        Basket<Fruit> basket = new Basket<>(fruits);
        Fruit[] items = basket.get();
        int weight = 0;
        for (int i = 0; i < items.length; i++) {
            weight += items[i].getSize();
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
    public int getSize() {
        return 1;
    }
}

class Orange extends Fruit {

    @Override
    public int getSize() {
        return 2;
    }
}