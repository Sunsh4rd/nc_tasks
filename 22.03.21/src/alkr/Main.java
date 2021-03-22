package alkr;

import inter.Movable;

public class Main {

    public static void main(String[] args) {
//        Parent p = new Parent(3, 8);
//        Child c = new Child(11, 12);
//        System.out.println(p.getFieldOne());
//        System.out.println(p.getFieldTwo());
//        System.out.println(c.getFieldOne());
//        System.out.println(c.getFieldTwo());

        Car c = new Car();
        Aircraft a = new Aircraft();
        ElectroCar ec = new ElectroCar();
        c.move();
        c.refuel();
        a.move();
        a.refuel();
        ec.move();
        ec.refuel();
    }
}

class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Car rides around...");
    }

    @Override
    public void refuel() {
        System.out.println("Tank is empty, refueling...");
    }
}

class Aircraft implements Movable {

    @Override
    public void move() {
        System.out.println("An aircraft takes off and flies away...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the tank with the help of the other aircraft...");
    }
}

class ElectroCar extends Car {

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void refuel() {
        System.out.println("Recharging batteries...");
    }
}

//class Parent {
//
//    private int fieldOne;
//    private int fieldTwo;
//
//    public Parent(int first, int second) {
//        this.fieldOne = first;
//        this.fieldTwo = second;
//    }
//
//    public int getFieldOne() {
//        return this.fieldOne;
//    }
//
//    public int getFieldTwo() {
//        return this.fieldTwo;
//    }
//}
//
//class Child extends Parent {
//
//    private int fieldOne;
//    private int fieldTwo;
//
//    public Child(int first, int second) {
//        super(first, second);
//    }
//
//    @Override
//    public int getFieldOne() {
//        return this.fieldOne;
//    }
//}

//class Earth {
//
//    private final String name;
//
//    public Earth(String name) {
//        if (this == null)
//        this.name = name;
//    }
//}