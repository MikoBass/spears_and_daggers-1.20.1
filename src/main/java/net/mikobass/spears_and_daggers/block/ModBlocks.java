package net.mikobass.spears_and_daggers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mikobass.spears_and_daggers.Spears_and_Daggers;
import net.mikobass.spears_and_daggers.block.custom.SoundBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block OLYMPIUM_BLOCK = registerBlock("olympium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.GOLD)
                    .instrument(Instrument.BELL)
                    /*.requiresTool()
                    .strength(5.0f, 6.0f)
                    .sounds(BlockSoundGroup.METAL)
                    ^this is custom but in the end you can copy all and then modify just like i did up there*/
            )
    );
    public static final Block DEEP_ROCK_ORE = registerBlock("deep_rock_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(5,9)));

    public static final Block DEEPSLATE_DEEP_ROCK_ORE = registerBlock("deepslate_deep_rock_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(5,9)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK)));






    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Spears_and_Daggers.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Spears_and_Daggers.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void  registerModBlocks(){
        Spears_and_Daggers.LOGGER.info("Registering ModBlocks for " + Spears_and_Daggers.MOD_ID);
    }
}
