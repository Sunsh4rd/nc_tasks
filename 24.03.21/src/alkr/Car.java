package alkr;

import java.util.Objects;

public class Car {

    private String mark;
    private Color color;
    private int year;

    public Car(String mark, Color color, int year) {
        this.mark = mark;
        this.color = color;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(mark, car.mark) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, color, year);
    }
}
