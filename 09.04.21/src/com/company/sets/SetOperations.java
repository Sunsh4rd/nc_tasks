package com.company.sets;

import java.util.HashSet;

public class SetOperations {

    public static void run() {

        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(2);
        s2.add(3);
        s2.add(4);

        System.out.println(union(s1, s2));
        System.out.println(except(s1, s2));
    }

    public static HashSet<Integer> union(HashSet<Integer> s1, HashSet<Integer>s2) {

        HashSet<Integer> union = new HashSet<Integer>();
        for (Integer e: s1) {
            if (s2.contains(e)) {
                union.add(e);
            }
        }
        return union;
    }

    public static HashSet<Integer> except(HashSet<Integer> s1, HashSet<Integer>s2) {

        HashSet<Integer> except = new HashSet<Integer>();
        for (Integer e: s1) {
            if (!s2.contains(e)) {
                except.add(e);
            }
        }

        for (Integer e: s2) {
            if (!s1.contains(e)) {
                except.add(e);
            }
        }
        return except;
    }
}
