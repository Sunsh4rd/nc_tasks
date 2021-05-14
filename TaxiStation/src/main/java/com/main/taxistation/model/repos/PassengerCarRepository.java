package com.main.taxistation.model.repos;

import com.main.taxistation.model.cars.passenger.PassengerCar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassengerCarRepository extends CrudRepository<PassengerCar, Integer> {

}
