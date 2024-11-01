package org.example.lab_01.AbstractFactory;

public class RasterizationShadingStage implements IShadingStage {
    @Override
    public void shade() {
        System.out.println("Rasterization shading stage");
    }
}
