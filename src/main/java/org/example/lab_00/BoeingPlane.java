package org.example.lab_00;

import org.example.lab_00.Interfaces.ICargoCarrier;
import org.example.lab_00.Interfaces.IFlyable;
import org.example.lab_00.Interfaces.IPassengerCarrier;

public class BoeingPlane implements IFlyable, IPassengerCarrier, ICargoCarrier {


    @Override
    public void loadCargo() {
        System.out.println("load boeing plane cargo");
    }

    @Override
    public void unloadCargo() {
        System.out.println("unload boeing plane cargo");
    }

    @Override
    public void takeOff() {
        System.out.println("boeing plane take off");
    }

    @Override
    public void land() {
        System.out.println("boeing plane land");
    }

    @Override
    public void boardPassengers() {
        System.out.println("boeing plane board passengers");
    }
}
