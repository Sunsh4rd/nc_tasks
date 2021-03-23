package car;

public class PassengerCar extends Car {

    static {
        maxPossibleWeight = 3500;
    }
    private final int maxWeight;

    public PassengerCar(int maxWeight) {
        if (maxWeight <= maxPossibleWeight) {
            this.maxWeight = maxWeight;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }
}
