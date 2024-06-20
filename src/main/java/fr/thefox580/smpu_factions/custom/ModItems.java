package fr.thefox580.smpu_factions.custom;

import fr.thefox580.smpu_factions.SMPU_Factions;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AVALORE_ADOPTION_CERTIFICATE = registerItem("avalore_adoption_certificate", new Item(new FabricItemSettings()
            .maxCount(1)));

    public static final Item EVERBLOOM_ADOPTION_CERTIFICATE = registerItem("everbloom_adoption_certificate", new Item(new FabricItemSettings()
            .maxCount(1)));

    public static final Item HAWTHORNE_ADOPTION_CERTIFICATE = registerItem("hawthorne_adoption_certificate", new Item(new FabricItemSettings()
            .maxCount(1)));

    public static final Item AVA_APPLE = registerItem("ava_apple", new Item(new FabricItemSettings()
            .food(ModFood.AVA_APPLE).maxCount(16)));

    public static final Item BLOOMING_BERRIES = registerItem("blooming_berries", new Item(new FabricItemSettings()
            .food(ModFood.BLOOMING_BERRIES).maxCount(16)));

    public static final Item THORNY_THISTLE = registerItem("thorny_thistle", new Item(new FabricItemSettings()
            .food(ModFood.THORNY_THISTLE).maxCount(16)));

    public static final Item AVALORE_SIGN = registerItem("avalore_sign",
            new SignItem(new FabricItemSettings(), ModBlocks.STANDING_AVALORE_SIGN, ModBlocks.WALL_AVALORE_SIGN));

    public static final Item EVERBLOOM_SIGN = registerItem("everbloom_sign",
            new SignItem(new FabricItemSettings(), ModBlocks.STANDING_EVERBLOOM_SIGN, ModBlocks.WALL_EVERBLOOM_SIGN));

    public static final Item HAWTHORNE_SIGN = registerItem("hawthorne_sign",
            new SignItem(new FabricItemSettings(), ModBlocks.STANDING_HAWTHORNE_SIGN, ModBlocks.WALL_HAWTHORNE_SIGN));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SMPU_Factions.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SMPU_Factions.LOGGER.info("Registering Mod Items for " + SMPU_Factions.MOD_ID);
    }

}
