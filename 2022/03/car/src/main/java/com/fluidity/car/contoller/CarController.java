package com.fluidity.car.contoller;

import com.fluidity.car.dto.Car;
import com.fluidity.car.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/addCargo")
    public Car addCargo(int cargoSpace, int vehicleType, int kgs) {
        log.info(">>>>>>> ATTEMPTING TO ADD CARGO");
        return carService.addCargo(kgs, new Car(cargoSpace, vehicleType));
    }
}
