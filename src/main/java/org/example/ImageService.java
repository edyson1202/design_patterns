package org.example;

import org.example.Interfaces.ImageScaler;

public class ImageService {
    private ImageScaler imageScaler;

    public ImageService (ImageScaler imageScaler) {
        this.imageScaler = imageScaler;
    }

    public ImageScaler getImageScaler() {
        return imageScaler;
    }
}
