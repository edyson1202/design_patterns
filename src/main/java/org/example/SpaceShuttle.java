package org.example;

import org.example.Interfaces.ICargoCarrier;
import org.example.Interfaces.IFlyable;
import org.example.Interfaces.IOrbiter;

public class SpaceShuttle implements IFlyable, IOrbiter, ICargoCarrier {
    @Override
    public void takeOff() {
        System.out.println("space shuttle take off");
    }

    @Override
    public void land() {
        System.out.println("space shuttle land");
    }

    @Override
    public void progradeBurn() {
        System.out.println("space shuttle prograde burn");
    }

    @Override
    public void retrogradeBurn() {
        System.out.println("space shuttle retrograde burn");
    }

    @Override
    public void loadCargo() {
        System.out.println("space shuttle load cargo");
    }

    @Override
    public void unloadCargo() {
        System.out.println("space shuttle unload cargo");
    }
}
