package encapsulation;

public class EncapsulationClass implements Encapsulation {

    private static int encapsulatedField;

    @Override
    public void setEncapsulatedField(int value) {
        encapsulatedField = value;
    }

    @Override
    public int getEncapsulationField() {
        return encapsulatedField;
    }
}
