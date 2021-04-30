package main;

import java.util.Random;

public class RandomGenerator {

    private int value = 0;

    public void setRandomValue() {
        Random r = new Random();
        this.value = r.nextInt(1000);
    }

    public int getValue() {
        return value;
    }
}
