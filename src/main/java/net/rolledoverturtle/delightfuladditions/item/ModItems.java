package net.rolledoverturtle.delightfuladditions.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import net.rolledoverturtle.delightfuladditions.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DelightfulAdditions.MOD_ID);

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> CHEESE_WHEEL = ITEMS.register("cheese_wheel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_SANDWICH =  ITEMS.register("cheese_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE_SANDWICH)));

    public static final RegistryObject<Item> RAW_CHEESE_PIZZA =  ITEMS.register("raw_cheese_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_PIZZA =  ITEMS.register("cheese_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PEPPERONI_PIZZA =  ITEMS.register("raw_pepperoni_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEPPERONI_PIZZA =  ITEMS.register("pepperoni_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VEGGIE_PIZZA =  ITEMS.register("raw_veggie_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VEGGIE_PIZZA =  ITEMS.register("veggie_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MEAT_LOVER_PIZZA =  ITEMS.register("raw_meat_lover_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEAT_LOVER_PIZZA =  ITEMS.register("meat_lover_pizza",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEESE_PIZZA_SLICE =  ITEMS.register("cheese_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE_PIZZA_SLICE)));
    public static final RegistryObject<Item> PEPPERONI_PIZZA_SLICE =  ITEMS.register("pepperoni_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPERONI_PIZZA_SLICE)));
    public static final RegistryObject<Item> VEGGIE_PIZZA_SLICE =  ITEMS.register("veggie_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.VEGGIE_PIZZA_SLICE)));
    public static final RegistryObject<Item> MEAT_LOVER_PIZZA_SLICE =  ITEMS.register("meat_lover_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.MEAT_LOVER_PIZZA_SLICE)));

    public static final RegistryObject<Item> PINEAPPLE =  ITEMS.register("pineapple",
            () -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_CROP.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
