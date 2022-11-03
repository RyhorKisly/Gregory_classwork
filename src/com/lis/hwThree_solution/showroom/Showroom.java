package com.roman.lis.hw.carsone.showroom;

import com.roman.lis.hw.carsone.model.Car;
import com.roman.lis.hw.carsone.model.enums.Color;
import com.roman.lis.hw.carsone.model.enums.EngineVolume;
import com.roman.lis.hw.carsone.model.enums.Model;
import com.roman.lis.hw.carsone.model.enums.Option;
import com.roman.lis.hw.carsone.model.enums.WheelSize;
import com.roman.lis.hw.carsone.factory.Factory;
import com.roman.lis.hw.carsone.service.Service;

import java.util.Set;

public class Showroom {

    private final Service service;
    private final Factory factory;

    public Showroom(Service service, Factory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        return factory.createCar(model, engineVolume, color, wheelSize, options);
    }

    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        service.changeWheels(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }

    public void printFactorySettings() {
        System.out.println(factory.getConfigurations());
    }

}
