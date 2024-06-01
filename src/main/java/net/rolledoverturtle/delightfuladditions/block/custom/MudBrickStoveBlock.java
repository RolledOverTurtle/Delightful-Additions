package net.rolledoverturtle.delightfuladditions.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.rolledoverturtle.delightfuladditions.block.ModBlockEntityTypes;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.block.StoveBlock;
import vectorwing.farmersdelight.common.block.entity.StoveBlockEntity;

public class MudBrickStoveBlock extends StoveBlock {
    public MudBrickStoveBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return (ModBlockEntityTypes.MUD_BRICK_STOVE.get()).create(pos, state);
    }

}
