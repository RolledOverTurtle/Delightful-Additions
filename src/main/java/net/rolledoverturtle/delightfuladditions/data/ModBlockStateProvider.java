package net.rolledoverturtle.delightfuladditions.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import net.rolledoverturtle.delightfuladditions.block.ModBlocks;
import net.rolledoverturtle.delightfuladditions.block.custom.PineappleCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DelightfulAdditions.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PINEAPPLE_CROP);

        makePineappleCrop((CropBlock) ModBlocks.PINEAPPLE_CROP.get(), "pineapple_stage_", "pineapple_stage_");

        simpleBlockWithItem(ModBlocks.CHEESE_VAT.get(),
                new ModelFile.UncheckedModelFile("block/cheese_vat"));

        // simpleBlockWithItem(ModBlocks.CHEESE_VAT.get(),
                //new ModelFile.UncheckedModelFile(modLoc("block/cheese_vat")));
    }

    public void makePineappleCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> pineappleStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[]pineappleStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((PineappleCropBlock) block).getAgeProperty()),
                new ResourceLocation(DelightfulAdditions.MOD_ID, "block/" + textureName + state.getValue(((PineappleCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    public ModelFile cubeAll(Block block) {
        return null;
    }
}
