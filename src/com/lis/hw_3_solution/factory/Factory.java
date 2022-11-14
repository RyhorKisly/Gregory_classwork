package com.lis.hw_3_solution.factory;

import com.lis.hw_3_solution.model.Car;
import com.lis.hw_3_solution.model.enums.Color;
import com.lis.hw_3_solution.model.enums.EngineVolume;
import com.lis.hw_3_solution.model.enums.Model;
import com.lis.hw_3_solution.model.enums.Option;
import com.lis.hw_3_solution.model.enums.WheelSize;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class Factory {

    private static final int YEAR = 2022;

    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;

    private final Storage storage;

    public Factory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
        this.storage = new Storage();
        fillStorageWithCars();
    }

    public Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        Car car = storage.getCarFromStorage(model, engineVolume, color, wheelSize);
        if (car != null) {
            if (car.getColor() != color) {
                car.setColor(color);
            }
            if (car.getWheelSize() != wheelSize) {
                car.setWheelSize(wheelSize);
            }
            // Add options check if needed.
            car.setOptions(options);
            return car;
        }
        return new Car(YEAR, model, engineVolume, color, wheelSize, options);
    }

    public String getConfigurations() {
        return format(
            "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
            Arrays.toString(colors),
            Arrays.toString(models),
            Arrays.toString(wheelSizes),
            Arrays.toString(engineVolumes)
        );
    }


    private void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
        Car car = new Car(YEAR, Model.AUDI_A4, EngineVolume.HIGH, Color.RED, WheelSize.SMALL, new HashSet<>());
        this.storage.addCarToStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.ABS);
        car = new Car(YEAR, Model.BMW_x6, EngineVolume.LOW, Color.RED, WheelSize.SMALL, options);
        this.storage.addCarToStorage(car);
    }
}
