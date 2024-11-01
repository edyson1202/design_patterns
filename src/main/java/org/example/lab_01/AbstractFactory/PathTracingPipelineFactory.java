package org.example.lab_01.AbstractFactory;

public class PathTracingPipelineFactory implements IAbstractGraphicsPipelineFactory {
    @Override
    public IScene getScene() {
        return new RTScene();
    }

    @Override
    public IShadingStage getShadingStage() {
        return new RTShadingStage();
    }

    @Override
    public IRenderer getRenderer() {
        return new PathTracer();
    }
}
