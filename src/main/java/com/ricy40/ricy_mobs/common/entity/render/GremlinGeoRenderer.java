package com.ricy40.ricy_mobs.common.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ricy40.ricy_mobs.common.entity.GremlinEntity;
import com.ricy40.ricy_mobs.common.entity.model.GremlinModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GremlinGeoRenderer extends GeoEntityRenderer<GremlinEntity> {
    public GremlinGeoRenderer(EntityRendererManager renderManager) {
        super(renderManager, new GremlinModel());
        this.shadowRadius = 0.3F;
    }
}
