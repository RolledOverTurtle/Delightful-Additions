package net.rolledoverturtle.delightfuladditions.data;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import vectorwing.farmersdelight.common.block.PieBlock;

public class ModBlockStates extends BlockStateProvider {

    public ModBlockStates(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    private String blockName(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    public ModelFile existingModel(String path) {
        return new ModelFile.ExistingModelFile(this.resourceBlock(path), this.models().existingFileHelper);
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(DelightfulAdditions.MOD_ID, "block/" + path);
    }

    public void pieBlock(Block block) {
        this.getVariantBuilder(block).forAllStates((state) -> {
            int bites = (Integer)state.getValue(PieBlock.BITES);
            String suffix = bites > 0 ? "_slice" + bites : "";
            ConfiguredModel.Builder var10000 = ConfiguredModel.builder();
            String var10002 = this.blockName(block);
            return var10000.modelFile(this.existingModel(var10002 + suffix)).rotationY(((int)((Direction)state.getValue(PieBlock.FACING)).toYRot() + 180) % 360).build();
        });
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
