package org.example.lab_01.AbstractFactory;

public class RasterizationPipelineFactory implements IAbstractGraphicsPipelineFactory {
    @Override
    public IScene getScene() {
        return new RasterizationScene();
    }

    @Override
    public IShadingStage getShadingStage() {
        return new RasterizationShadingStage();
    }

    @Override
    public IRenderer getRenderer() {
        return new Rasterizer();
    }
}
