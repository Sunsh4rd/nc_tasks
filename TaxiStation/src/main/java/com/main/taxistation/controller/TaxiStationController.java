package com.main.taxistation.controller;

import com.main.taxistation.model.repos.PassengerCarRepository;
import com.main.taxistation.model.cars.passenger.PassengerCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/taxistation")
public class TaxiStationController {

    @Autowired
    private PassengerCarRepository passengerCarRepository;

    public TaxiStationController(PassengerCarRepository passengerCarRepository) {
        this.passengerCarRepository = passengerCarRepository;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewCar (@RequestParam String brand
            ,@RequestParam String model, @RequestParam String color
            , @RequestParam String plate) {

        PassengerCar c = new PassengerCar();
        c.setBrand(brand);
        c.setModel(model);
        c.setColor(color);
        c.setPlate(plate);
        passengerCarRepository.save(c);
        return "Saved";
    }

    @GetMapping(path = "/index")
    public String showStartPage() {
        return "index";
    }

    @PostMapping(path = "/success")
    public String successOrder() {
        return "success";
    }
}
