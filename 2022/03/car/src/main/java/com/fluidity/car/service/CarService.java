package com.fluidity.car.service;

import com.fluidity.car.dto.Car;

public interface CarService {

    void drive();

    Car addCargo(int kgs, Car car);

    void fillUpPetrol();

    void changeOil();

    void printStats();
}
