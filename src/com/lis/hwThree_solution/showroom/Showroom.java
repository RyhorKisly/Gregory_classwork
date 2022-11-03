package com.lis.hwThree_solution.showroom;

import com.lis.hwThree_solution.model.Car;
import com.lis.hwThree_solution.model.enums.Color;
import com.lis.hwThree_solution.model.enums.EngineVolume;
import com.lis.hwThree_solution.model.enums.Model;
import com.lis.hwThree_solution.model.enums.Option;
import com.lis.hwThree_solution.model.enums.WheelSize;
import com.lis.hwThree_solution.factory.Factory;
import com.lis.hwThree_solution.service.Service;

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
