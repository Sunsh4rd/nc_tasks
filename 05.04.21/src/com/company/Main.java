package com.company;

import book.Book;
import book.SetAuthor;
import book.SetName;
import book.SetReleaseYear;
import space.Space;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
//        Space space = new Space("Space", 10);
//
//        System.out.println(space.getClass());
//        Class<?> clazz = space.getClass();
//        System.out.println(clazz.getName());
//
//        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
//        System.out.println(clazz.getDeclaredField("Coordinates"));
//        System.out.println(Arrays.toString(clazz.getFields()));
//        System.out.println(clazz.getField("name"));
//        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));
//        System.out.println(clazz.getDeclaredMethod("hide"));
//        System.out.println(Arrays.toString(clazz.getMethods()));
//        System.out.println(clazz.getMethod("dropSpace"));

        Book book = new Book();
        System.out.println(book.getName() + book.getAuthor() + book.getReleaseYear());
    }
}
