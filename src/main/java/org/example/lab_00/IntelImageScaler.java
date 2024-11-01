package org.example.lab_00;

import org.example.lab_00.Interfaces.ImageScaler;

public class IntelImageScaler implements ImageScaler {
    @Override
    public void scale(String image, int width, int height) {
        System.out.println("Scale the image using Intel technology.");
    }
}
