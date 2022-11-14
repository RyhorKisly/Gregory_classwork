package com.lis.hw_3_solution.service;

import com.lis.hw_3_solution.model.Car;
import com.lis.hw_3_solution.model.enums.*;

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
