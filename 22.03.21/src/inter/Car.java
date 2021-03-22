package inter;

public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Car rides around...");
    }

    @Override
    public void refuel() {
        System.out.println("Tank is empty, refueling...");
    }
}
