package com.main.taxistation.model.repos;

import com.main.taxistation.model.cars.cargo.CargoCar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CargoCarRepository extends CrudRepository<CargoCar, Integer> {

}
