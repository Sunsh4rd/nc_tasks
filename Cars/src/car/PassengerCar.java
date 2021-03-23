package car;

public class PassengerCar extends Car {

    private static final int maxPossibleWeight = 3500;
    private int weight;

    public PassengerCar(int weight) {

        if (weight <= maxPossibleWeight) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getWeight() { return this.weight; }

    @Override
    public void loadToMax() {
        this.weight = maxPossibleWeight;
    }
}
