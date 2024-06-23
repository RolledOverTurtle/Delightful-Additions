package net.rolledoverturtle.delightfuladditions;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rolledoverturtle.delightfuladditions.block.ModBlockEntityTypes;
import net.rolledoverturtle.delightfuladditions.block.ModBlocks;
import net.rolledoverturtle.delightfuladditions.block.entity.ModBlockEntities;
import net.rolledoverturtle.delightfuladditions.block.entity.ModEntities;
import net.rolledoverturtle.delightfuladditions.block.entity.client.ModBoatRenderer;
import net.rolledoverturtle.delightfuladditions.item.ModCreativeModeTabs;
import net.rolledoverturtle.delightfuladditions.item.ModItems;
import net.rolledoverturtle.delightfuladditions.screen.CheeseVatMenu;
import net.rolledoverturtle.delightfuladditions.screen.CheeseVatScreen;
import net.rolledoverturtle.delightfuladditions.screen.ModMenuTypes;
import net.rolledoverturtle.delightfuladditions.util.ModWoodTypes;
import org.slf4j.Logger;
import vectorwing.farmersdelight.FarmersDelight;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DelightfulAdditions.MOD_ID)
public class DelightfulAdditions
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "delightfuladditions";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public DelightfulAdditions() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModBlockEntityTypes.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.COCONUT);

            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

            MenuScreens.register(ModMenuTypes.CHEESE_VAT_MENU.get(), CheeseVatScreen::new);

        }
    }
}
