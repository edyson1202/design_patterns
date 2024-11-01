package org.example.lab_01.AbstractFactory;

public interface IAbstractGraphicsPipelineFactory {
    IScene getScene();

    IShadingStage getShadingStage();

    IRenderer getRenderer();
}
