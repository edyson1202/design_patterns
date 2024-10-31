package org.example;

public class Main {
    public static void main(String[] args) {

        // DEPENDENCY INVERSION
        ImageService imageService = new ImageService(new NvidiaImageScaler());

        imageService.getImageScaler().scale("image_data", 128, 128);

        imageService = new ImageService(new IntelImageScaler());

        imageService.getImageScaler().scale("image_data", 128, 128);

        // INTERFACE SEGREGATION
        BoeingPlane plane = new BoeingPlane();
        plane.takeOff();
        plane.boardPassengers();

        SpaceShuttle spaceShuttle = new SpaceShuttle();
        spaceShuttle.takeOff();
        spaceShuttle.progradeBurn();
    }
}