## Software Design Laboratory Works

### Lab 00 - implement two SOLID principles

### Lab 01 - implement 3 creational design patters

#### Overview
This laboratory work focuses on implementing 3 creational design patterns

- AbstractFactory
- Builder
- Singleton

#### AbstractFactory

`IAbstractGraphicsPipelineFactory` is an Graphics Pipeline Interface that creates several related components used in graphics rendering

- Scene
- Shading Stage
- Renderer

Each component concrete implementation implements one of the following interfaces: `IShadingStage`, `IScene`, `IRenderer`

The concrete implementations are 
`RTShadingStage`, `RTScene`, and `PathTracer` for a ray tracing pipeline, and
`RasterizationShadingStage`, `RasterizationScene`, and `Rasterizer` for a rasterization pipeline

`IAbstractGraphicsPipelineFactory` has two implementations: `PathTracingPipelineFactory` and `RasterizationPipelineFactory`

#### Builder
`SatellineBuilder` is a class that is responsible for the complex construction process of complex satellite objects

A satellite has several characteristics:
- `GPSType`
- `OrientationSystemType`
- `PowerSourceType`

By using a `SatelliteBuilder` one can construct various types of satellites equipped with different types of equipment easily.

#### Singleton
A `VulkanDevice` is a class that should be instantiated only once,
by using a singleton the `VulkanDevice` instance can be accessed globally and more than one instantiation is prevented.