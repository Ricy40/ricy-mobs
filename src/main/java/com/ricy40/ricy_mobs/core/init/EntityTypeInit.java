package com.ricy40.ricy_mobs.core.init;

import com.ricy40.ricy_mobs.RicyMobs;
import com.ricy40.ricy_mobs.common.entity.GremlinEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, RicyMobs.MOD_ID);


    public static final RegistryObject<EntityType<GremlinEntity>> GREMLIN = ENTITY_TYPES.register("gremlin",
            () -> EntityType.Builder.of(GremlinEntity::new, EntityClassification.CREATURE)
                    .sized(0.6f, 1F)
                    .build(new ResourceLocation(RicyMobs.MOD_ID, "gremlin").toString()));

    public static void register (IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}

