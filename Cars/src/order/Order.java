package order;

import java.util.HashMap;

public class Order {

    private HashMap<String, Integer> order = new HashMap<>();

    private String getOnlyNumbersFromOrder(String order) {
        order = order.replaceAll("[^\\d]", " ");
        order = order.trim();
        order = order.replaceAll(" +", " ");
        return order;
    }

    public Order(String orderString) {
        String[] orderNumbers = getOnlyNumbersFromOrder(orderString).split(" ");
        this.order.put("people", Integer.parseInt(orderNumbers[0]));
        this.order.put("cargo", Integer.parseInt(orderNumbers[1]));
    }

    private HashMap<String, Integer> numberOfCarsToOrder() {
        HashMap<String, Integer> numbers = new HashMap<>();
        int passenger = this.order.get("people");
        int passengerCar = passenger % 4 == 0 ? passenger / 4 : passenger / 4 + 1;

        int cargo = this.order.get("cargo");
        int cargoCar = 0;
        while (cargo > 0) {
            if (cargo >= 10000) {
                cargoCar += cargo / 10000;
                cargo %= 10000;
            } else {
                if (cargo >= 3500) {
                    passengerCar += cargo / 3500;
                    cargo %= 3500;
                }
                else {
                    passengerCar++;
                    break;
                }
            }
        }
        numbers.put("passengerCar", passengerCar);
        numbers.put("cargoCar", cargoCar);
        return numbers;
    }

    @Override
    public String toString() {
        HashMap<String, Integer> numberOfOrderedCars = numberOfCarsToOrder();
        int passengerCar = numberOfOrderedCars.get("passengerCar");
        int cargoCar = numberOfOrderedCars.get("cargoCar");
        String message;
        if (cargoCar == 0) {
            message = String.format("Ваш заказ принят. Ожидайте %d легковых машин.", passengerCar);
        }
        else {
            message = String.format("Ваш заказ принят. Ожидайте %d легковых машин и %d грузовых.", passengerCar, cargoCar);
        }
        return message;
    }
}
