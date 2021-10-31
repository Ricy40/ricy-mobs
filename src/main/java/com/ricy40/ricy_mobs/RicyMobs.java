package com.ricy40.ricy_mobs;

import com.ricy40.ricy_mobs.core.init.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;


@Mod(RicyMobs.MOD_ID)
public class RicyMobs {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ricy_mobs";
    public static final ItemGroup RICYMOBS_GROUP = new RicyMobsGroup("ricy_mobstab");

    public RicyMobs() {
        GeckoLib.initialize();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        SoundInit.SOUNDS.register(bus);
        ParticleInit.PARTICLES.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EntityTypeInit.ENTITIES.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static class RicyMobsGroup extends ItemGroup {

        public RicyMobsGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.RICYMOBS.get().getDefaultInstance();
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            super.fillItemList(items);
        }
    }

}
