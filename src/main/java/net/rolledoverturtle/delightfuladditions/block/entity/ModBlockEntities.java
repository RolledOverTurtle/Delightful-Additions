package net.rolledoverturtle.delightfuladditions.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import net.rolledoverturtle.delightfuladditions.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DelightfulAdditions.MOD_ID);

    public static final RegistryObject<BlockEntityType<CheeseVatEntity>> CHEESE_VAT_BE =
            BLOCK_ENTITIES.register("cheese_vat_be", () ->
                    BlockEntityType.Builder.of(CheeseVatEntity::new,
                            ModBlocks.CHEESE_VAT.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
