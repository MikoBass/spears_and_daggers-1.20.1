package net.mikobass.spears_and_daggers.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mikobass.spears_and_daggers.Spears_and_Daggers;
import net.mikobass.spears_and_daggers.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup OLYMPIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Spears_and_Daggers.MOD_ID, "olympium_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spears_and_daggers"))
                    .icon(() -> new ItemStack(ModItems.OLYMPIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OLYMPIUM_INGOT);
                        entries.add(ModItems.RAW_DEEP_ROCK);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.NOXBERRIES);
                        entries.add(ModItems.NOXIUM_CRYSTAL);

                        entries.add(ModBlocks.OLYMPIUM_BLOCK);
                        entries.add(ModBlocks.DEEP_ROCK_ORE);
                        entries.add(ModBlocks.DEEPSLATE_DEEP_ROCK_ORE);
                        entries.add(ModBlocks.SOUND_BLOCK);


                    }).build());

    public static void  registerItemGroups(){
        Spears_and_Daggers.LOGGER.info("Register Item Groups for "+Spears_and_Daggers.MOD_ID);
    }
}
