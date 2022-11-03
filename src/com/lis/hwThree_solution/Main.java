package com.lis.hwThree_solution;

import com.lis.hwThree_solution.model.Car;
import com.lis.hwThree_solution.model.enums.Color;
import com.lis.hwThree_solution.model.enums.EngineVolume;
import com.lis.hwThree_solution.model.enums.Model;
import com.lis.hwThree_solution.model.enums.WheelSize;
import com.lis.hwThree_solution.factory.Factory;
import com.lis.hwThree_solution.service.Service;
import com.lis.hwThree_solution.showroom.Showroom;

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
