package com.roman.lis.hw.carsone.factory;

import com.roman.lis.hw.carsone.model.Car;
import com.roman.lis.hw.carsone.model.enums.Color;
import com.roman.lis.hw.carsone.model.enums.EngineVolume;
import com.roman.lis.hw.carsone.model.enums.Model;
import com.roman.lis.hw.carsone.model.enums.WheelSize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Storage {

    private final List<Car> cars = new ArrayList<>();

    public void addCarToStorage(Car car) {
        cars.add(car);
    }

    public Car getCarFromStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize) {
        Iterator<Car> iterator = cars.listIterator();
        List<Car> removed = new ArrayList<>();
        Car car = null;
        while (iterator.hasNext()) {
            Car temp = iterator.next();
            if (verifyModelEngine(temp, model, engineVolume)) {
                if (car == null) {
                    car = temp;
                    iterator.remove();
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    iterator.remove();
                    removed.add(car);
                    car = temp;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && car.getWheelSize() != wheelSize) {
                    iterator.remove();
                    removed.add(car);
                    car = temp;
                }
                // Add options check as well if needed.
            }
        }
        cars.addAll(removed);
        return car;
    }

    private boolean verifyModelEngine(Car car, Model model, EngineVolume engineVolume) {
        return car.getModel() == model && car.getEngineVolume() == engineVolume;
    }

}
