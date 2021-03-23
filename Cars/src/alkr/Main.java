package alkr;

import car.*;

public class Main {

    public static void main(String[] args) {
	    PassengerCar passengerCar = new PassengerCar(3500);
        System.out.println(passengerCar.getMaxWeight());
        CargoCar cargoCar = new CargoCar(7000);
        System.out.println(cargoCar.getMaxWeight());
    }
}
