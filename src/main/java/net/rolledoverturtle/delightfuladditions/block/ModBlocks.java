package net.rolledoverturtle.delightfuladditions.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rolledoverturtle.delightfuladditions.DelightfulAdditions;
// import net.rolledoverturtle.delightfuladditions.block.custom.MudBrickStoveBlock;
import net.rolledoverturtle.delightfuladditions.block.custom.*;
import net.rolledoverturtle.delightfuladditions.item.ModItems;
import net.rolledoverturtle.delightfuladditions.util.ModWoodTypes;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.block.StoveBlock;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DelightfulAdditions.MOD_ID);

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (state) -> {
            return (Boolean)state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
        };
    }

    public static final RegistryObject<Block> CHEESE_PIZZA_BLOCK = registerBlock("cheese_pizza_block",
            () -> new PieBlock(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.APPLE_PIE.get()), ModItems.CHEESE_PIZZA_SLICE));

    public static final RegistryObject<Block> PINEAPPLE_CROP = BLOCKS.register("pineapple_crop",
            () -> new PineappleCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> CHEESE_VAT = registerBlock("cheese_vat",
            () -> new CheeseVatBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> COCONUT_LOG = registerBlock("coconut_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> COCONUT_WOOD = registerBlock("coconut_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_COCONUT_LOG = registerBlock("stripped_coconut_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_COCONUT_WOOD = registerBlock("stripped_coconut_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final RegistryObject<Block> COCONUT_PLANKS = registerBlock("coconut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> COCONUT_SIGN = BLOCKS.register("coconut_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.COCONUT));
    public static final RegistryObject<Block> COCONUT_WALL_SIGN = BLOCKS.register("coconut_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.COCONUT));

    public static final RegistryObject<Block> COCONUT_HANGING_SIGN = BLOCKS.register("coconut_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.COCONUT));
    public static final RegistryObject<Block> COCONUT_WALL_HANGING_SIGN = BLOCKS.register("coconut_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.COCONUT));

    // public static final RegistryObject<Block> MUD_BRICK_STOVE = registerBlock("mud_brick_stove",
    // () -> new MudBrickStoveBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).lightLevel(litBlockEmission(13))));
    // Properties.copy(Blocks.BRICKS).lightLevel(litBlockEmission(13))

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
