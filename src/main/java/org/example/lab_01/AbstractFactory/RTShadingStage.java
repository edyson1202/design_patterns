package org.example.lab_01.AbstractFactory;

public class RTShadingStage implements IShadingStage {
    @Override
    public void shade() {
        System.out.println("RT shading stage");
    }
}
