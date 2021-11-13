package com.ricy40.ricy_mobs.core.events;

import com.ricy40.ricy_mobs.RicyMobs;
import com.ricy40.ricy_mobs.common.entity.GremlinEntity;
import com.ricy40.ricy_mobs.core.init.EntityTypeInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RicyMobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RicyMobsEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityTypeInit.GREMLIN.get(), GremlinEntity.setCustomAttributes().build());
    }
}
