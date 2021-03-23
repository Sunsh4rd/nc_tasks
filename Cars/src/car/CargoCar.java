package car;

public class CargoCar extends Car {

    static {
        maxPossibleWeight = 10000;
    }
    private final int maxWeight;

    public CargoCar(int maxWeight) {
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
