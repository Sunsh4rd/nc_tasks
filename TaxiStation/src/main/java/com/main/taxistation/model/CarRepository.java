package com.main.taxistation.model;

import com.main.taxistation.model.cars.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
