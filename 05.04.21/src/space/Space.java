package space;

public class Space {

    public String name;

    private int Coordinates;

    public Space(String name, int coordinates) {
        this.name = name;
        Coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoordinates() {
        return Coordinates;
    }

    public void setCoordinates(int coordinates) {
        Coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Space{" +
                "name='" + name + '\'' +
                ", Coordinates=" + Coordinates +
                '}';
    }

    private void hide() {
        System.out.println("Hidden");
    }

    public void dropSpace() {
        System.out.println("Space dropped");
    }
}
