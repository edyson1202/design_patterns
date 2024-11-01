package org.example.lab_01.AbstractFactory;

public class Rasterizer implements IRenderer {
    @Override
    public void render() {
        System.out.println("Rasterizer render");
    }
}
