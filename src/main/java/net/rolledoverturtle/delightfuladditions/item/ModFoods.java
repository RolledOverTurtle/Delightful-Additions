package net.rolledoverturtle.delightfuladditions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {
    /* public static final int BRIEF_DURATION = 600;
       public static final int SHORT_DURATION = 1200;
       public static final int MEDIUM_DURATION = 3600;
       public static final int LONG_DURATION = 6000; */

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.2f).build();
    public static final FoodProperties CHEESE_SANDWICH = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.6f).build();

    public static final FoodProperties CHEESE_PIZZA_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.6f).build();
    public static final FoodProperties PEPPERONI_PIZZA_SLICE = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.7f).meat().build();
    public static final FoodProperties VEGGIE_PIZZA_SLICE = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.9f).build();
    public static final FoodProperties MEAT_LOVER_PIZZA_SLICE = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.9f).meat().build();
    public static final FoodProperties HAWAIIAN_PIZZA_SLICE = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.7f).meat().build();

    public static final FoodProperties PINA_COLADA = new FoodProperties.Builder().effect(new MobEffectInstance(MobEffects.LUCK, 2400, 0), 1.0F).alwaysEat().build();

    public static final FoodProperties PINEAPPLE_SLICE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.3f).build();
    public static final FoodProperties COCONUT = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.3f).build();
    public static final FoodProperties PRAWN = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.1f).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();
    public static final FoodProperties COOKED_PRAWN = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.8f).build();
    public static final FoodProperties COCONUT_PRAWN = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.7f).build();
    public static final FoodProperties PRAWN_COCKTAIL = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.6f).build();
    public static final FoodProperties PRAWN_NIGIRI = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.6f).build();
    public static final FoodProperties TROPICAL_FRIED_RICE = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.4f).effect(new MobEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build();
    public static final FoodProperties SWEET_SOUR_CHICKEN_WITH_RICE = new FoodProperties.Builder().nutrition(12)
            .saturationMod(0.8f).effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0), 1.0F).meat().build();
    public static final FoodProperties SWEET_SOUR_COCONUT_PRAWNS_WITH_RICE = new FoodProperties.Builder().nutrition(14)
            .saturationMod(0.75f).effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0F).build();
    public static final FoodProperties SWEET_SOUR_SAUCE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.4f).build();
    public static final FoodProperties MOQUECA_STEW = new FoodProperties.Builder().nutrition(12)
            .saturationMod(0.8f).effect(new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0F).build();






}
