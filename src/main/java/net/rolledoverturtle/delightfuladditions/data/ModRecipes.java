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
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.data.recipe.CuttingRecipes;

import java.util.function.Consumer;

import static net.rolledoverturtle.delightfuladditions.item.ModItems.PRAWN_COCKTAIL;
import static net.rolledoverturtle.delightfuladditions.item.ModItems.RAW_CHEESE_PIZZA;

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SWEET_SOUR_CHICKEN_WITH_RICE.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_CHICKEN_CUTS.get())
                .requires(ModItems.SWEET_SOUR_SAUCE.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .requires(Items.BOWL)
                .unlockedBy("has_sweet_sour_sauce", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SWEET_SOUR_SAUCE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SWEET_SOUR_COCONUT_PRAWNS_WITH_RICE.get())
                .requires(ModItems.COCONUT_PRAWN.get())
                .requires(ModItems.COCONUT_PRAWN.get())
                .requires(ModItems.SWEET_SOUR_SAUCE.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .requires(Items.BOWL)
                .unlockedBy("has_sweet_sour_sauce", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SWEET_SOUR_SAUCE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.PINA_COLADA.get())
                .requires(ModItems.COCONUT.get())
                .requires(ModItems.PINEAPPLE_SLICES.get())
                .requires(ModItems.PINEAPPLE_SLICES.get())
                .requires(Items.ICE)
                .unlockedBy("has_coconut", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.COCONUT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.PRAWN_NIGIRI.get(), 2)
                .requires(ModItems.COOKED_PRAWN.get())
                .requires(ModItems.COOKED_PRAWN.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .unlockedBy("has_prawn", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PRAWN.get()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, RAW_CHEESE_PIZZA.get())
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

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_HAWAIIAN_PIZZA.get())
                .pattern(" H ")
                .pattern("PTP")
                .pattern("CDC")
                .define('H', vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .define('T', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .define('P', ModItems.PINEAPPLE_SLICES.get())
                .define('C', ModItems.CHEESE.get())
                .define('D', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PRAWN_COCKTAIL.get())
                .pattern("ETC")
                .pattern("PBP")
                .define('E', Items.EGG)
                .define('T', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .define('C', vectorwing.farmersdelight.common.registry.ModItems.CABBAGE.get())
                .define('P', ModItems.COOKED_PRAWN.get())
                .define('B', Items.GLASS_BOTTLE)
                .unlockedBy("has_prawn", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PRAWN.get()))
                .save(consumer);

        SimpleCookingRecipeBuilder smelting_cheese_pizza = SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_CHEESE_PIZZA.get()), RecipeCategory.FOOD, ModItems.CHEESE_PIZZA.get(), 0.35F, 200);
        smelting_cheese_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smelting_cheese_pizza.save(consumer);
        SimpleCookingRecipeBuilder smelting_pepperoni_pizza = SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_PEPPERONI_PIZZA.get()), RecipeCategory.FOOD, ModItems.PEPPERONI_PIZZA.get(), 0.35F, 200);
        smelting_pepperoni_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smelting_pepperoni_pizza.save(consumer);
        SimpleCookingRecipeBuilder smelting_veggie_pizza = SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_VEGGIE_PIZZA.get()), RecipeCategory.FOOD, ModItems.VEGGIE_PIZZA.get(), 0.35F, 200);
        smelting_veggie_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smelting_veggie_pizza.save(consumer);
        SimpleCookingRecipeBuilder smelting_meat_lover_pizza = SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_MEAT_LOVER_PIZZA.get()), RecipeCategory.FOOD, ModItems.MEAT_LOVER_PIZZA.get(), 0.35F, 200);
        smelting_meat_lover_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smelting_meat_lover_pizza.save(consumer);

        /* SimpleCookingRecipeBuilder smoking_cheese_pizza = SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.RAW_CHEESE_PIZZA.get()), RecipeCategory.FOOD, ModItems.CHEESE_PIZZA.get(), 0.35F, 100);
        smoking_cheese_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smoking_cheese_pizza.save(consumer);
        SimpleCookingRecipeBuilder smoking_pepperoni_pizza = SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.RAW_PEPPERONI_PIZZA.get()), RecipeCategory.FOOD, ModItems.PEPPERONI_PIZZA.get(), 0.35F, 100);
        smoking_pepperoni_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smoking_pepperoni_pizza.save(consumer);
        SimpleCookingRecipeBuilder smoking_veggie_pizza = SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.RAW_VEGGIE_PIZZA.get()), RecipeCategory.FOOD, ModItems.VEGGIE_PIZZA.get(), 0.35F, 100);
        smoking_veggie_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smoking_veggie_pizza.save(consumer);
        SimpleCookingRecipeBuilder smoking_meat_lover_pizza = SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.RAW_MEAT_LOVER_PIZZA.get()), RecipeCategory.FOOD, ModItems.MEAT_LOVER_PIZZA.get(), 0.35F, 100);
        smoking_meat_lover_pizza.unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHEESE.get()));
        smoking_meat_lover_pizza.save(consumer); */

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.CHEESE_WHEEL.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.CHEESE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.CHEESE_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.CHEESE_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.PEPPERONI_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.PEPPERONI_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.VEGGIE_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES),  ModItems.VEGGIE_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.MEAT_LOVER_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.MEAT_LOVER_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.HAWAIIAN_PIZZA.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.HAWAIIAN_PIZZA_SLICE.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.PINEAPPLE.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.PINEAPPLE_SLICES.get(), 4).build(consumer);

        //(ItemLike) vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get(), 2).build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.VINEGAR.get(), 1, 100, 0.35F, Items.GLASS_BOTTLE).addIngredient(ModItems.PINEAPPLE_SLICES.get()).addIngredient(ModItems.PINEAPPLE_SLICES.get()).addIngredient(Items.SUGAR).unlockedByItems("has_pineapple", ModItems.PINEAPPLE.get()).setRecipeBookTab(CookingPotRecipeBookTab.MISC).build(consumer);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SWEET_SOUR_SAUCE.get(), 1, 100, 0.35F, Items.BOWL).addIngredient(ModItems.PINEAPPLE_SLICES.get()).addIngredient(ModItems.VINEGAR.get()).addIngredient(Items.HONEY_BOTTLE).unlockedByItems("has_pineapple", ModItems.PINEAPPLE.get()).setRecipeBookTab(CookingPotRecipeBookTab.MISC).build(consumer);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MOQUECA.get(), 1, 200, 0.35F, Items.BOWL).addIngredient(ModItems.COCONUT.get()).addIngredient(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get()).addIngredient(ModItems.PRAWN.get()).addIngredient(vectorwing.farmersdelight.common.registry.ModItems.ONION.get()).unlockedByItems("has_prawn", ModItems.PRAWN.get()).setRecipeBookTab(CookingPotRecipeBookTab.MEALS).build(consumer);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.COCONUT_PRAWN.get(), 2, 200, 0.35F).addIngredient(ModItems.COCONUT.get()).addIngredient(ModItems.PRAWN.get()).addIngredient(ModItems.PRAWN.get()).addIngredient(Items.BREAD).addIngredient(ForgeTags.EGGS).unlockedByItems("has_prawn", ModItems.PRAWN.get()).setRecipeBookTab(CookingPotRecipeBookTab.MEALS).build(consumer);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TROPICAL_FRIED_RICE.get(), 1, 200, 0.35F, Items.BOWL).addIngredient(ModItems.PINEAPPLE_SLICES.get()).addIngredient(ModItems.PRAWN.get()).addIngredient(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get()).unlockedByItems("has_prawn", ModItems.PRAWN.get()).setRecipeBookTab(CookingPotRecipeBookTab.MEALS).build(consumer);

    }


}
