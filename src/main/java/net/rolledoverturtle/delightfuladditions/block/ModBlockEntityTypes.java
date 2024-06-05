package net.rolledoverturtle.delightfuladditions.block;

import com.mojang.datafixers.types.Type;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import vectorwing.farmersdelight.common.block.entity.*;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DelightfulAdditions.MOD_ID);

    /* public static final RegistryObject<BlockEntityType<StoveBlockEntity>> MUD_BRICK_STOVE = TILES.register("mud_brick_stove", () -> {
        return BlockEntityType.Builder.of(StoveBlockEntity::new, new Block[]{(Block) ModBlocks.MUD_BRICK_STOVE.get()}).build((Type)null);
    }); */

    public static void register(IEventBus bus)  {
        TILES.register(bus);
    }
}

