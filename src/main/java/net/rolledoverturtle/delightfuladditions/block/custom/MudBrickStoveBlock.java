package net.rolledoverturtle.delightfuladditions.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
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

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (state.getValue(LIT)) {
            return BaseEntityBlock.createTickerHelper(
                    blockEntityType,
                    ModBlockEntityTypes.MUD_BRICK_STOVE.get(),
                    level.isClientSide ? StoveBlockEntity::animationTick : StoveBlockEntity::cookingTick);
        }
        return null;
    }

}
