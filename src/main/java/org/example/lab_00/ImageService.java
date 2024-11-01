package org.example.lab_00;

import org.example.lab_00.Interfaces.ImageScaler;

public class ImageService {
    private ImageScaler imageScaler;

    public ImageService (ImageScaler imageScaler) {
        this.imageScaler = imageScaler;
    }

    public ImageScaler getImageScaler() {
        return imageScaler;
    }
}
