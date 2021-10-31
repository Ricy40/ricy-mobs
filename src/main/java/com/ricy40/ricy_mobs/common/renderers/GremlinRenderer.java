package com.ricy40.ricy_mobs.common.renderers;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.example.client.model.entity.ExampleEntityModel;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GremlinRenderer extends GeoEntityRenderer<GeoExampleEntity> {
    public ExampleGeoRenderer(EntityRendererManager renderManager) {
        super(renderManager, new ExampleEntityModel());
        this.shadowSize = 0.7F; //change 0.7 to the desired shadow size.
    }

    protected GremlinRenderer(EntityRendererManager renderManager, AnimatedGeoModel<GeoExampleEntity> modelProvider) {
        super(renderManager, modelProvider);
    }
}
