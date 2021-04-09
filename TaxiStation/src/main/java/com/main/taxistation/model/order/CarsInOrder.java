package com.main.taxistation.model.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarsInOrder {

    @Id
    private Integer orderId;

    private Integer PassengerCarId;

    private Integer CargoCarId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPassengerCarId() {
        return PassengerCarId;
    }

    public void setPassengerCarId(Integer passengerCarId) {
        PassengerCarId = passengerCarId;
    }

    public Integer getCargoCarId() {
        return CargoCarId;
    }

    public void setCargoCarId(Integer cargoCarId) {
        CargoCarId = cargoCarId;
    }
}
