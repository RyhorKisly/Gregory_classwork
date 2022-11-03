package com.roman.lis.hw.carsone;

import com.roman.lis.hw.carsone.model.Car;
import com.roman.lis.hw.carsone.model.enums.Color;
import com.roman.lis.hw.carsone.model.enums.EngineVolume;
import com.roman.lis.hw.carsone.model.enums.Model;
import com.roman.lis.hw.carsone.model.enums.WheelSize;
import com.roman.lis.hw.carsone.factory.Factory;
import com.roman.lis.hw.carsone.service.Service;
import com.roman.lis.hw.carsone.showroom.Showroom;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        Factory factory = new Factory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values());
        Showroom showroom = new Showroom(service, factory);

        showroom.printFactorySettings();

        Car car = showroom.orderCar(
            Model.AUDI_A4,
            EngineVolume.HIGH,
            Color.GREEN,
            WheelSize.SMALL,
            new HashSet<>()
        );
    }

}
