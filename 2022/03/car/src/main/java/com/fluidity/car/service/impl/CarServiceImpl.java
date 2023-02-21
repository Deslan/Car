package com.fluidity.car.service.impl;

import com.fluidity.car.dto.Car;
import com.fluidity.car.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    public static final String TOO_HEAVY = "too heavy";

    public void drive() {
        //implementation hidden
    }

    public Car addCargo(int kgs, Car car) {
        if (car.getVehicleType() == 0) {   //car
            if (car.getVehicleType() > 500) {
                throw new IllegalArgumentException(TOO_HEAVY);
            }
        } else if (car.getVehicleType() == 1) {  //electric car
            if (kgs > 500) {
                throw new IllegalArgumentException(TOO_HEAVY);
            }
        } else if (car.getVehicleType() == 2 && kgs > 18000) {  //truck
            throw new IllegalArgumentException(TOO_HEAVY);
        }
        car.setCargoSpace(kgs);
        return car;
    }

    public void fillUpPetrol() {
        //implementation hidden
    }

    public void changeOil() {
        //implementation hidden
    }

    public void printStats() {
        //implementation hidden
    }
}
