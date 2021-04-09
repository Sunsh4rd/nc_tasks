package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startAddToArrayList = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endAddToArrayList = new Date().getTime();

        int timeAddToArray = (int) (endAddToArrayList - startAddToArrayList);

        long startAddToLinkedList = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long endAddToLinkedList = new Date().getTime();

        int timeAddToLinked = (int) (endAddToLinkedList - startAddToLinkedList);

        System.out.println(timeAddToArray); //19
        System.out.println(timeAddToLinked); //28

        long startSearchArray = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(50000);
        }
        long endSearchArray = new Date().getTime();

        long timeSearchArray = endSearchArray - startSearchArray;

        long startSearchLinked = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(50000);
        }
        long endSearchLinked = new Date().getTime();

        long timeSearchLinked = endSearchLinked - startSearchLinked;

        System.out.println(timeSearchArray); //3
        System.out.println(timeSearchLinked); //26504

        long startDeleteArray = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
        }
        long endDeleteArray = new Date().getTime();

        long timeDeleteArray = endDeleteArray - startDeleteArray;

        long startDeleteLinked = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        long endDeleteLinked = new Date().getTime();

        long timeDeleteLinked = endDeleteLinked - startDeleteLinked;

        System.out.println(timeDeleteArray); //1120
        System.out.println(timeDeleteLinked); //14
    }
}
