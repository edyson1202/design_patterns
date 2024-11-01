package org.example;

import org.example.lab_01.AbstractFactory.*;
import org.example.lab_01.Builder.*;
import org.example.lab_01.Singleton.VulkanDevice;

public class Main {
    public static void main(String[] args) {

//        // DEPENDENCY INVERSION
//        ImageService imageService = new ImageService(new NvidiaImageScaler());
//
//        imageService.getImageScaler().scale("image_data", 128, 128);
//
//        imageService = new ImageService(new IntelImageScaler());
//
//        imageService.getImageScaler().scale("image_data", 128, 128);
//
//        // INTERFACE SEGREGATION
//        BoeingPlane plane = new BoeingPlane();
//        plane.takeOff();
//        plane.boardPassengers();
//
//        SpaceShuttle spaceShuttle = new SpaceShuttle();
//        spaceShuttle.takeOff();
//        spaceShuttle.progradeBurn();

        // abstract factory
        IAbstractGraphicsPipelineFactory pipelineFactory = new PathTracingPipelineFactory();
        IScene scene = pipelineFactory.getScene();
        IShadingStage shadingStage = pipelineFactory.getShadingStage();
        IRenderer renderer = pipelineFactory.getRenderer();

        // builder
        Satellite nasaSatellite = new SatelliteBuilder()
                .gps(GPSType.STATE_OF_THE_ART)
                .orientationSystem(OrientationSystemType.ELECTROMAGNETIC)
                .powerSource(PowerSourceType.DOUBLE_SOLAR_PANEL)
                .build();

        // singleton
        VulkanDevice device = VulkanDevice.getInstance();
    }
}