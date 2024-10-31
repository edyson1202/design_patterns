package org.example;

import org.example.Interfaces.ImageScaler;

public class IntelImageScaler implements ImageScaler {
    @Override
    public void scale(String image, int width, int height) {
        System.out.println("Scale the image using Intel technology.");
    }
}