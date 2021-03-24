package car;

public class CargoCar extends Car {

    private static final int maxPossibleWeight = 10000;
    private int weight;

    public CargoCar(int weight) {

        if (weight <= maxPossibleWeight) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public void loadToMax() {
        this.weight = maxPossibleWeight;
    }
}
