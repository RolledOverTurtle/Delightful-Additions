package net.rolledoverturtle.delightfuladditions.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import net.rolledoverturtle.delightfuladditions.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DelightfulAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.COCONUT_LOG.get())
                .add(ModBlocks.COCONUT_WOOD.get())
                .add(ModBlocks.STRIPPED_COCONUT_LOG.get())
                .add(ModBlocks.STRIPPED_COCONUT_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.COCONUT_PLANKS.get());
    }
}
