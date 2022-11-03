package com.roman.lis.hw.carsone.service;

import com.roman.lis.hw.carsone.model.Car;
import com.roman.lis.hw.carsone.model.enums.*;

public class Service {

    public void changeColor(Car car, Color color) {
        if (car != null && color != null && !color.equals(car.getColor())) {
            car.setColor(color);
        }
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }

    public void addOption(Car car, Option option) {
        if (car != null && option != null && car.getOptions() != null) {
            car.getOptions().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null && car.getOptions() != null) {
            car.getOptions().remove(option);
        }
    }

}
