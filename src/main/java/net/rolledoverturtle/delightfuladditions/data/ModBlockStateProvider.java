package net.rolledoverturtle.delightfuladditions.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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
        //blockWithItem(ModBlocks.PINEAPPLE_CROP);

        makePineappleCrop((CropBlock) ModBlocks.PINEAPPLE_CROP.get(), "pineapple_stage_", "pineapple_stage_");

        simpleBlockWithItem(ModBlocks.CHEESE_VAT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cheese_vat")));

        logBlock(((RotatedPillarBlock) ModBlocks.COCONUT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.COCONUT_WOOD.get()), blockTexture(ModBlocks.COCONUT_LOG.get()), blockTexture(ModBlocks.COCONUT_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_COCONUT_LOG.get()), blockTexture(ModBlocks.STRIPPED_COCONUT_LOG.get()),
                new ResourceLocation(DelightfulAdditions.MOD_ID, "block/stripped_coconut_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_COCONUT_WOOD.get()), blockTexture(ModBlocks.STRIPPED_COCONUT_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_COCONUT_LOG.get()));

        blockItem(ModBlocks.COCONUT_LOG);
        blockItem(ModBlocks.COCONUT_WOOD);
        blockItem(ModBlocks.STRIPPED_COCONUT_LOG);
        blockItem(ModBlocks.STRIPPED_COCONUT_WOOD);

        blockWithItem(ModBlocks.COCONUT_PLANKS);

        leavesBlock(ModBlocks.COCONUT_LEAVES);

        signBlock(((StandingSignBlock) ModBlocks.COCONUT_SIGN.get()), ((WallSignBlock) ModBlocks.COCONUT_WALL_SIGN.get()),
                blockTexture(ModBlocks.COCONUT_PLANKS.get()));

        hangingSignBlock(ModBlocks.COCONUT_HANGING_SIGN.get(), ModBlocks.COCONUT_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.COCONUT_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(DelightfulAdditions.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
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

}
