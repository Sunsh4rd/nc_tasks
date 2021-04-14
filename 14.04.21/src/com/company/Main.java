package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] randoms = new int[100];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 1000);
        }

        System.out.println(Arrays.toString(boxed(randoms)));
        System.out.println(filter(boxed(randoms)));

    }

    public static Integer[] boxed(int[] arr) {

        Integer[] boxed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxed[i] = arr[i];
        }
        return boxed;
    }

    public static ArrayList<Integer> filter(Integer[] arr) {

        ArrayList<Integer> filter = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                filter.add(integer);
            }
        }
        return filter;
    }
}

class Color {

    private Integer number;
    private String name;

    public Color(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "number=" + number +
                ", name='" + name + '}';
    }
}