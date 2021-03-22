package inter;

public class ElectricCar implements Electric {

    @Override
    public void move() {
        System.out.println("The electric power pushes this vehicle forward...");
    }

    @Override
    public void recharge() {
        System.out.println("Recharging batteries...");
    }
}
