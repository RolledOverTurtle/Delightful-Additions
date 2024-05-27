package net.rolledoverturtle.delightfuladditions.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
import net.rolledoverturtle.delightfuladditions.item.ModItems;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DelightfulAdditions.MOD_ID);


    public static final RegistryObject<Block> CHEESE_PIZZA_BLOCK = registerBlock("cheese_pizza_block", () -> new PieBlock(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.APPLE_PIE.get()), ModItems.CHEESE_PIZZA_SLICE));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    //private static <T extends Block> RegistryObject<T> registerPieBlock(String name, Supplier)


    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
