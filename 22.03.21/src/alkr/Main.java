package alkr;

import parent.Parent;
import child.Child;
import inter.*;
import earth.Earth;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent(5, 9);
        Child child = new Child(6, 2);
        System.out.println(parent.getFieldOne());
        System.out.println(parent.getFieldTwo());
        System.out.println(child.getFieldOne());
        System.out.println(child.getFieldTwo());

        Car car = new Car();
        Aircraft aircraft = new Aircraft();
        ElectricCar electricCar = new ElectricCar();
        car.move();
        car.refuel();
        aircraft.move();
        aircraft.refuel();
        electricCar.move();
        electricCar.recharge();

        //this particular bit makes no sense
        Earth earth = Earth.getEarth();
        Earth earth1 = Earth.getEarth();
        //but we can see that "==" says "true" here
        System.out.println(earth == earth1); //must say true
        //meaning, that there's one and only Earth object indeed

        System.out.println(Earth.getEarth().hashCode());
        System.out.println(Earth.getEarth().hashCode());
        System.out.println(Earth.getEarth().hashCode());
        System.out.println(Earth.getEarth().hashCode());
        System.out.println(Earth.getEarth().hashCode());
        //just to see if it's the same hash code each time
    }
}
