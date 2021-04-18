package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        int[] randoms = new int[100];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 1000);
        }

        Integer[] boxed = boxed(randoms);
        System.out.println(Arrays.toString(boxed));
        ArrayList<Integer> filter = filter(boxed);
        System.out.println(filter);
        ArrayList<Integer> sorted = sorted(filter);
        System.out.println(sorted);
        ArrayList<Integer> skip = new ArrayList<>();
        try {
             skip = skip(sorted, 10);
            System.out.println(skip);
        } catch (Exception e) {
            System.out.println("Wrong n");
        }
        ArrayList<Integer> limit = new ArrayList<>();
        try {
             limit = limit(skip, 10);
            System.out.println(limit);
        } catch (Exception e) {
            System.out.println("Wrong n");
        }
        ArrayList<Integer> distinct = distinct(limit);
        System.out.println(distinct);
        ArrayList<Color> map = map(distinct);
        System.out.println(map);
        peek(map);
        System.out.println(map);
        ArrayList<String> mapToString;
        mapToString = mapToString(map);
        System.out.println(mapToString);
        ArrayList<String[]> flatMap;
        flatMap = flatMap(mapToString);
        for (String[] s: flatMap) {
            for (String str: s) {
                System.out.println(str);
            }
        }
        ArrayList<String> removeChars;
        removeChars = removeChars(flatMap);
        System.out.println(removeChars);

        String reduce = reduce(removeChars);
        System.out.println(reduce);
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

    public static ArrayList<Integer> sorted(ArrayList<Integer> arr) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        sorted.sort(Comparator.naturalOrder());
        return sorted;
    }

    public static ArrayList<Integer> skip(ArrayList<Integer> arr, int n) throws Exception {
        ArrayList<Integer> skip = new ArrayList<>();
        if (n > arr.size()) {
            throw new Exception();
        } else {
            for (int i = n; i < arr.size(); i++) {
                skip.add(arr.get(i));
            }
        }
        return skip;
    }

    public static ArrayList<Integer> limit(ArrayList<Integer> arr, int n) throws Exception {
        ArrayList<Integer> limit = new ArrayList<>();
        if (n > arr.size()) {
            throw new Exception();
        } else {
            for (int i = 0; i < n; i++) {
                limit.add(arr.get(i));
            }
        }
        return limit;
    }

    public static ArrayList<Integer> distinct(ArrayList<Integer> arr) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (Integer i: arr) {
            if (!distinct.contains(i))
            distinct.add(i);
        }
        return distinct;
    }

    public static ArrayList<Color> map(ArrayList<Integer> arr) {
        ArrayList<Color> map = new ArrayList<>();
        for (Integer i: arr) {
            map.add(new Color(i));
        }
        return map;
    }

    public static void peek(ArrayList<Color> arr) {
        for (Color c: arr) {
            c.setName(String.valueOf(System.currentTimeMillis()));
        }
    }

    public static ArrayList<String> mapToString(ArrayList<Color> arr) {
        ArrayList<String> map = new ArrayList<>();
        for (Color c: arr) {
            map.add(c.toString());
        }
        return map;
    }

    public static ArrayList<String[]> flatMap(ArrayList<String> arr) {
        ArrayList<String[]> flatMap = new ArrayList<>();
        for (String s: arr) {
            flatMap.add(s.split("="));
        }
        return flatMap;
    }

    public static ArrayList<String> removeChars(ArrayList<String[]> arg) {
        ArrayList<String> removeChars = new ArrayList<>();
        for (String[] s: arg) {
            for (String str: s) {
                String replace = str.replace("{", " ");
                String repl2 = replace.replace(",", "");
                String repl3 = repl2.replace("'", "");
                String fin = repl3.replace("}", "");
                removeChars.add(fin);
            }
        }
        return removeChars;
    }

    public static String reduce(ArrayList<String> arr) {
        StringBuilder reduce = new StringBuilder();
        for (String str: arr) {
            reduce.append(str).append(" ");
        }
        return String.valueOf(reduce);
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