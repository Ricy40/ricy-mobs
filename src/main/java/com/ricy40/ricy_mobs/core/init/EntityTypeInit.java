package com.ricy40.ricy_mobs.core.init;

import com.ricy40.ricy_mobs.RicyMobs;
import com.ricy40.ricy_mobs.common.entity.GremlinEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, RicyMobs.MOD_ID);


    public static final RegistryObject<EntityType<GremlinEntity>> IMP = ENTITIES.register("gremlin",
            () -> EntityType.Builder.of(GremlinEntity::new, EntityClassification.CREATURE)
                    .sized(0.6f, 1.95F)
                    .clientTrackingRange(9)
                    .build(new ResourceLocation(RicyMobs.MOD_ID, "gremlin").toString()));
}
