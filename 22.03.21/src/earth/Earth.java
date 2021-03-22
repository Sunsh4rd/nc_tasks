package earth;

public class Earth {

    private static Earth earth;
    private static final String name = "Earth (one and only)";

    public static Earth getEarth() {
        if (earth == null) {
            earth = new Earth();
        }
        return earth;
    }

    private Earth() { }

    public String showName() { return Earth.name; }
}
