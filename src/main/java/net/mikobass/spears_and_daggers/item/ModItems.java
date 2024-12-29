package net.mikobass.spears_and_daggers.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mikobass.spears_and_daggers.Spears_and_Daggers;
import net.mikobass.spears_and_daggers.item.custom.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public  static final Item OLYMPIUM_INGOT = registerItem("olympium_ingot", new Item(new FabricItemSettings()));
    //registers the existance of an item
    public  static final Item RAW_DEEP_ROCK = registerItem("raw_deep_rock", new Item(new FabricItemSettings()));
    public  static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public  static final Item NOXBERRIES = registerItem("noxberries",
            new Item(new FabricItemSettings().food(ModFoodComponents.NOXBERRIES)));
    public  static final Item NOXIUM_CRYSTAL = registerItem("noxium_crystal",
            new Item(new FabricItemSettings()));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(OLYMPIUM_INGOT);
        //adds item to creative inventory 1/2
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Spears_and_Daggers.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Spears_and_Daggers.LOGGER.info("Registering Mod Items for " + Spears_and_Daggers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        //adds item to creative inventory 2/2
    }
}
