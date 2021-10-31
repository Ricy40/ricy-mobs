package com.ricy40.ricy_mobs.common.models;

import net.minecraft.util.ResourceLocation;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GremlinModel extends AnimatedGeoModel<JackInTheBoxItem> {
    @Override
    public ResourceLocation getModelLocation(JackInTheBoxItem object)
    {
        return new ResourceLocation(GeckoLib.ModID, "geo/gremlin_entity.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JackInTheBoxItem object)
    {
        return new ResourceLocation(GeckoLib.ModID, "textures/entity/gremlin_entity.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JackInTheBoxItem object)
    {
        return new ResourceLocation(GeckoLib.ModID, "animations/jackinthebox.animation.json");
    }
}