package com.ricy40.ricy_mobs.common.models;

import net.minecraft.util.ResourceLocation;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GremlinModel extends AnimatedGeoModel {
    @Override
    public ResourceLocation getModelLocation(Object entity) {
        return new ResourceLocation(GeckoLib.ModID, "geo/gremlin.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object entity) {
        return new ResourceLocation(GeckoLib.ModID, "textures/entity/gremlin.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object entity) {
        return new ResourceLocation(GeckoLib.ModID, "animations/gremlin.animationF.json");
    }
}