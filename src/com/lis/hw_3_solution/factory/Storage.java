package com.lis.hw_3_solution.factory;

import com.lis.hw_3_solution.model.Car;
import com.lis.hw_3_solution.model.enums.Color;
import com.lis.hw_3_solution.model.enums.EngineVolume;
import com.lis.hw_3_solution.model.enums.Model;
import com.lis.hw_3_solution.model.enums.WheelSize;

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
