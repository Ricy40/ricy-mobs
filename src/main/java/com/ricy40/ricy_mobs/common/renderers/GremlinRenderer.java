package com.ricy40.ricy_mobs.common.renderers;

import com.ricy40.ricy_mobs.common.models.GremlinModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GremlinRenderer extends GeoEntityRenderer<GeoExampleEntity> {
    public GremlinRenderer(EntityRendererManager renderManager) {
        super(renderManager, new GremlinModel());
        this.shadowRadius = 0.7F; //change 0.7 to the desired shadow size.
    }

}
