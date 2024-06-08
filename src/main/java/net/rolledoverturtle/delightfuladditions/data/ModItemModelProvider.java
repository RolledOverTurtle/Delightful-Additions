package net.rolledoverturtle.delightfuladditions.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import net.rolledoverturtle.delightfuladditions.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DelightfulAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.CHEESE);
        simpleItem(ModItems.CHEESE_WHEEL);
        simpleItem(ModItems.CHEESE_SANDWICH);

        simpleItem(ModItems.CHEESE_PIZZA);
        simpleItem(ModItems.PEPPERONI_PIZZA);
        simpleItem(ModItems.VEGGIE_PIZZA);
        simpleItem(ModItems.MEAT_LOVER_PIZZA);
        simpleItem(ModItems.HAWAIIAN_PIZZA);

        simpleItem(ModItems.RAW_CHEESE_PIZZA);
        simpleItem(ModItems.RAW_PEPPERONI_PIZZA);
        simpleItem(ModItems.RAW_VEGGIE_PIZZA);
        simpleItem(ModItems.RAW_MEAT_LOVER_PIZZA);
        simpleItem(ModItems.RAW_HAWAIIAN_PIZZA);

        simpleItem(ModItems.CHEESE_PIZZA_SLICE);
        simpleItem(ModItems.PEPPERONI_PIZZA_SLICE);
        simpleItem(ModItems.VEGGIE_PIZZA_SLICE);
        simpleItem(ModItems.MEAT_LOVER_PIZZA_SLICE);
        simpleItem(ModItems.HAWAIIAN_PIZZA_SLICE);

        simpleItem(ModItems.PINEAPPLE);
        simpleItem(ModItems.PINEAPPLE_SLICES);
        simpleItem(ModItems.COCONUT);
        simpleItem(ModItems.COCONUT_HUSK);
        simpleItem(ModItems.PINA_COLADA);
        simpleItem(ModItems.PRAWN);
        simpleItem(ModItems.COOKED_PRAWN);
        simpleItem(ModItems.COCONUT_PRAWN);
        simpleItem(ModItems.PRAWN_COCKTAIL);
        simpleItem(ModItems.PRAWN_NIGIRI);
        simpleItem(ModItems.TROPICAL_FRIED_RICE);
        simpleItem(ModItems.MOQUECA);
        simpleItem(ModItems.SWEET_SOUR_CHICKEN_WITH_RICE);
        simpleItem(ModItems.SWEET_SOUR_COCONUT_PRAWNS_WITH_RICE);
        simpleItem(ModItems.SWEET_SOUR_SAUCE);
        simpleItem(ModItems.VINEGAR);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DelightfulAdditions.MOD_ID, "item/" + item.getId().getPath()));
    }
}
