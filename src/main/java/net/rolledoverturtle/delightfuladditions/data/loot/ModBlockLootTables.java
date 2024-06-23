package net.rolledoverturtle.delightfuladditions.data.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.block.ModBlocks;
import net.rolledoverturtle.delightfuladditions.block.custom.PineappleCropBlock;
import net.rolledoverturtle.delightfuladditions.item.ModItems;

import java.util.Set;
import java.util.function.Function;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //this.dropSelf(ModBlocks.PINEAPPLE_CROP.get());

        /*LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.PINEAPPLE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PineappleCropBlock.AGE, 5)); */

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.PINEAPPLE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PineappleCropBlock.AGE, 7))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.PINEAPPLE_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PineappleCropBlock.AGE, 8)));

        /*LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.PINEAPPLE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PineappleCropBlock.AGE, 7))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.PINEAPPLE_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PineappleCropBlock.AGE, 8))); */

        this.add(ModBlocks.PINEAPPLE_CROP.get(), createCropDrops(ModBlocks.PINEAPPLE_CROP.get(),
                ModItems.PINEAPPLE.get(), ModItems.PINEAPPLE_SLICES.get(), lootitemcondition$builder));

        this.dropSelf(ModBlocks.CHEESE_VAT.get());

        this.dropSelf(ModBlocks.COCONUT_LOG.get());
        this.dropSelf(ModBlocks.COCONUT_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_COCONUT_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_COCONUT_WOOD.get());
        this.dropSelf(ModBlocks.COCONUT_PLANKS.get());

        this.add(ModBlocks.COCONUT_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CHEESE_VAT.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!

        this.add(ModBlocks.COCONUT_SIGN.get(), block ->
                createSingleItemTable(ModItems.COCONUT_SIGN.get()));
        this.add(ModBlocks.COCONUT_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.COCONUT_SIGN.get()));
        this.add(ModBlocks.COCONUT_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.COCONUT_HANGING_SIGN.get()));
        this.add(ModBlocks.COCONUT_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.COCONUT_HANGING_SIGN.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
