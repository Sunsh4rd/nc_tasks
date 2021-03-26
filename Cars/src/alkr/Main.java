package alkr;

import car.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));

//        for (int i = 0; i < 10; i++) {
//
//            try {
//                int weight = random.nextInt(4500);
//                System.out.printf("Trying to create a passenger car of weight %d\n", weight);
//                PassengerCar passengerCar = new PassengerCar(weight);
//                System.out.println("Passenger car weighs " + passengerCar.getWeight());
//                passengerCar.loadToMax();
//                System.out.println("Passenger car is fully loaded and weighs " + passengerCar.getWeight());
//            }
//            catch (IllegalArgumentException ex) {
//                System.out.println("Unable to create a passenger car of such weight");
//            }
//
//            try {
//                int weight = random.nextInt(11000);
//                System.out.printf("Trying to create a cargo car of weight %d\n", weight);
//                CargoCar cargoCar = new CargoCar(weight);
//                System.out.println("Cargo car weighs " + cargoCar.getWeight());
//                cargoCar.loadToMax();
//                System.out.println("Cargo car is fully loaded and weighs " + cargoCar.getWeight());
//            }
//            catch (IllegalArgumentException ex) {
//                System.out.println("Unable to create a cargo car of such weight");
//            }
//        }
    }
}
