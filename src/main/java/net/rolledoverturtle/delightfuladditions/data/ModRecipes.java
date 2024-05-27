package net.rolledoverturtle.delightfuladditions.data;

import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.rolledoverturtle.delightfuladditions.item.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.data.recipe.CuttingRecipes;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {
    public ModRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHEESE_SANDWICH.get())
                .requires(Items.BREAD)
                .requires(ModItems.CHEESE.get())
                .requires(ModItems.CHEESE.get())
                .unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_CHEESE_PIZZA.get())
                .pattern(" T ")
                .pattern("CDC")
                .define('T', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .define('C', ModItems.CHEESE.get())
                .define('D', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_PEPPERONI_PIZZA.get())
                .pattern("BTB")
                .pattern("CDC")
                .define('B', vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .define('T', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .define('C', ModItems.CHEESE.get())
                .define('D', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_VEGGIE_PIZZA.get())
                .pattern(" O ")
                .pattern("MTM")
                .pattern("CDC")
                .define('M', Items.BROWN_MUSHROOM)
                .define('O', vectorwing.farmersdelight.common.registry.ModItems.ONION.get())
                .define('T', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .define('C', ModItems.CHEESE.get())
                .define('D', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_MEAT_LOVER_PIZZA.get())
                .pattern(" H ")
                .pattern("NTB")
                .pattern("CDC")
                .define('H', vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .define('N', vectorwing.farmersdelight.common.registry.ModItems.CHICKEN_CUTS.get())
                .define('B', vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .define('T', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .define('C', ModItems.CHEESE.get())
                .define('D', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()))
                .save(consumer);


        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.CHEESE_WHEEL.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), (ItemLike) ModItems.CHEESE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.CHEESE_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), (ItemLike) ModItems.CHEESE_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.PEPPERONI_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), (ItemLike) ModItems.PEPPERONI_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.VEGGIE_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), (ItemLike) ModItems.VEGGIE_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.MEAT_LOVER_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), (ItemLike) ModItems.MEAT_LOVER_PIZZA_SLICE.get(), 4).build(consumer);


        //(ItemLike) vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get(), 2).build(consumer);



    }
}
