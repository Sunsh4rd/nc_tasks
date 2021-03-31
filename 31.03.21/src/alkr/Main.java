package alkr;

import task.Marker;
import task.Outer;

public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer("Inner name");
        checkMarker(new Marker() {
            @Override
            public void printYourself() {
                System.out.println("Marker");
            }
        });
        Outer.Inner inner = new Outer("New name").new Inner("New name");
        checkMarker(new Marker() {
            @Override
            public void printYourself() {
                System.out.println("One more Marker");
            }
        });
        Outer.Nested nested = new Outer.Nested();
    }

    private static void checkMarker(Marker marker) {

        marker.printYourself();
    }
}
