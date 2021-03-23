package car;

public class PassengerCar extends Car {

    private static final int maxPossibleWeight = 3500;
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
