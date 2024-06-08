package net.rolledoverturtle.delightfuladditions.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.crafting.Ingredient;
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
    public static final RegistryObject<Item> RAW_HAWAIIAN_PIZZA =  ITEMS.register("raw_hawaiian_pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAWAIIAN_PIZZA =  ITEMS.register("hawaiian_pizza",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEESE_PIZZA_SLICE =  ITEMS.register("cheese_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE_PIZZA_SLICE)));
    public static final RegistryObject<Item> PEPPERONI_PIZZA_SLICE =  ITEMS.register("pepperoni_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPERONI_PIZZA_SLICE)));
    public static final RegistryObject<Item> VEGGIE_PIZZA_SLICE =  ITEMS.register("veggie_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.VEGGIE_PIZZA_SLICE)));
    public static final RegistryObject<Item> MEAT_LOVER_PIZZA_SLICE =  ITEMS.register("meat_lover_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.MEAT_LOVER_PIZZA_SLICE)));
    public static final RegistryObject<Item> HAWAIIAN_PIZZA_SLICE =  ITEMS.register("hawaiian_pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoods.HAWAIIAN_PIZZA_SLICE)));

    public static final RegistryObject<Item> PINEAPPLE =  ITEMS.register("pineapple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINEAPPLE_SLICES =  ITEMS.register("pineapple_slices",
            () -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_CROP.get(), new Item.Properties().food(ModFoods.PINEAPPLE_SLICE)));

    public static final RegistryObject<Item> PRAWN =  ITEMS.register("prawn",
            () -> new Item(new Item.Properties().food(ModFoods.PRAWN)));
    public static final RegistryObject<Item> COOKED_PRAWN =  ITEMS.register("cooked_prawn",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_PRAWN)));
    public static final RegistryObject<Item> COCONUT =  ITEMS.register("coconut",
            () -> new Item(new Item.Properties().food(ModFoods.COCONUT)));
    public static final RegistryObject<Item> COCONUT_HUSK =  ITEMS.register("coconut_husk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINA_COLADA =  ITEMS.register("pina_colada",
            () -> new Item(new Item.Properties().food(ModFoods.PINA_COLADA)));
    public static final RegistryObject<Item> COCONUT_PRAWN =  ITEMS.register("coconut_prawn",
            () -> new Item(new Item.Properties().food(ModFoods.COCONUT_PRAWN)));
    public static final RegistryObject<Item> PRAWN_NIGIRI =  ITEMS.register("prawn_nigiri",
            () -> new Item(new Item.Properties().food(ModFoods.PRAWN_NIGIRI)));
    public static final RegistryObject<Item> PRAWN_COCKTAIL =  ITEMS.register("prawn_cocktail",
            () -> new Item(new Item.Properties().food(ModFoods.PRAWN_COCKTAIL)));
    public static final RegistryObject<Item> SWEET_SOUR_CHICKEN_WITH_RICE=  ITEMS.register("sweet_sour_chicken_with_rice",
            () -> new Item(new Item.Properties().food(ModFoods.SWEET_SOUR_CHICKEN_WITH_RICE)));
    public static final RegistryObject<Item> SWEET_SOUR_COCONUT_PRAWNS_WITH_RICE =  ITEMS.register("sweet_sour_coconut_prawns_with_rice",
            () -> new Item(new Item.Properties().food(ModFoods.SWEET_SOUR_COCONUT_PRAWNS_WITH_RICE)));
    public static final RegistryObject<Item> TROPICAL_FRIED_RICE =  ITEMS.register("tropical_fried_rice",
            () -> new Item(new Item.Properties().food(ModFoods.TROPICAL_FRIED_RICE)));
    public static final RegistryObject<Item> MOQUECA =  ITEMS.register("moqueca",
            () -> new Item(new Item.Properties().food(ModFoods.MOQUECA)));

    public static final RegistryObject<Item> VINEGAR =  ITEMS.register("vinegar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWEET_SOUR_SAUCE =  ITEMS.register("sweet_sour_sauce",
            () -> new Item(new Item.Properties().food(ModFoods.SWEET_SOUR_SAUCE)));



    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }


}
