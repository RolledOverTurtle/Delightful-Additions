package net.rolledoverturtle.delightfuladditions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DelightfulAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DELIGHTFUL_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("delightful_additions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MEAT_LOVER_PIZZA.get()))
                    .title(Component.translatable("creativetab.delightful_additions_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.CHEESE_PIZZA_SLICE.get());
                        output.accept(ModItems.PEPPERONI_PIZZA_SLICE.get());
                        output.accept(ModItems.VEGGIE_PIZZA_SLICE.get());
                        output.accept(ModItems.MEAT_LOVER_PIZZA_SLICE.get());

                        output.accept(ModItems.CHEESE_PIZZA.get());
                        output.accept(ModItems.PEPPERONI_PIZZA.get());
                        output.accept(ModItems.VEGGIE_PIZZA.get());
                        output.accept(ModItems.MEAT_LOVER_PIZZA.get());
                        output.accept(ModItems.RAW_CHEESE_PIZZA.get());
                        output.accept(ModItems.RAW_PEPPERONI_PIZZA.get());
                        output.accept(ModItems.RAW_VEGGIE_PIZZA.get());
                        output.accept(ModItems.RAW_MEAT_LOVER_PIZZA.get());

                        output.accept(ModItems.CHEESE.get());
                        output.accept(ModItems.CHEESE_WHEEL.get());
                        output.accept(ModItems.CHEESE_SANDWICH.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
