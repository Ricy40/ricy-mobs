package com.ricy40.ricy_mobs.common.entity.model;

import com.ricy40.ricy_mobs.RicyMobs;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GremlinModel extends AnimatedGeoModel {

    public GremlinModel() {
    }

    @Override
    public ResourceLocation getModelLocation(Object entity) {
        return new ResourceLocation(RicyMobs.MOD_ID, "geo/gremlin.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object entity) {
        return new ResourceLocation(RicyMobs.MOD_ID, "textures/entity/gremlin.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object entity) {
        return new ResourceLocation(RicyMobs.MOD_ID, "animations/gremlin/gremlin.animation.json");
    }
}