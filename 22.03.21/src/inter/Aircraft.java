package inter;

public class Aircraft implements Movable {

    @Override
    public void move() {
        System.out.println("An aircraft takes off and flies away...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the tank with the help of the other aircraft...");
    }
}
