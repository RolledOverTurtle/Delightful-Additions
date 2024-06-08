package net.rolledoverturtle.delightfuladditions.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import vectorwing.farmersdelight.common.block.PieBlock;

public class ModFoods {
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.2f).build();
    public static final FoodProperties CHEESE_SANDWICH = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();

    public static final FoodProperties CHEESE_PIZZA_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();
    public static final FoodProperties PEPPERONI_PIZZA_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties VEGGIE_PIZZA_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();
    public static final FoodProperties MEAT_LOVER_PIZZA_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties HAWAIIAN_PIZZA_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();

    public static final FoodProperties PINEAPPLE_SLICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();
    public static final FoodProperties COCONUT = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();
    public static final FoodProperties PRAWN = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.4f).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build();
    public static final FoodProperties COOKED_PRAWN = new FoodProperties.Builder().meat().nutrition(6)
            .saturationMod(0.4f).build();
    public static final FoodProperties COCONUT_PRAWN = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties PRAWN_COCKTAIL = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties PRAWN_NIGIRI = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties PINA_COLADA = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();
    public static final FoodProperties TROPICAL_FRIED_RICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties MOQUECA = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties SWEET_SOUR_CHICKEN_WITH_RICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties SWEET_SOUR_COCONUT_PRAWNS_WITH_RICE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).meat().build();
    public static final FoodProperties SWEET_SOUR_SAUCE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.4f).build();

    Foods




}
