package com.ricy40.ricy_mobs.common.renderers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ricy40.ricy_mobs.common.entity.GremlinEntity;
import com.ricy40.ricy_mobs.common.models.GremlinModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GremlinGeoRenderer extends GeoEntityRenderer<GeoExampleEntity> {
    public GremlinGeoRenderer(EntityRendererManager renderManager) {
        super(renderManager, new GremlinModel());
        this.shadowRadius = 0.7F; //change 0.7 to the desired shadow size.
    }

    @Override
    public RenderType getRenderType(GremlinEntity animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    protected float getDeathMaxRotation(GremlinEntity entityLivingBaseIn) {
        return 0.0F;
    }

}
