package fr.thefox580.smpu_factions.custom;

import fr.thefox580.smpu_factions.SMPU_Factions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Identifier AVALORE_SIGN_TEXTURE = new Identifier(SMPU_Factions.MOD_ID,
            "entity/signs/avalore");

    public static final Identifier EVERBLOOM_SIGN_TEXTURE = new Identifier(SMPU_Factions.MOD_ID,
            "entity/signs/everbloom");

    public static final Identifier HAWTHORNE_SIGN_TEXTURE = new Identifier(SMPU_Factions.MOD_ID,
            "entity/signs/hawthorne");

    public static final Block STANDING_AVALORE_SIGN = Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, "avalore_standing_sign"),
            new SMPUSignBlock(AVALORE_SIGN_TEXTURE, FabricBlockSettings.create().solid().instrument(Instrument.BASS).noCollision().strength(1.0F)
                    .burnable()));
    public static final Block WALL_AVALORE_SIGN = Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, "avalore_wall_sign"),
            new SMPUWallSignBlock(AVALORE_SIGN_TEXTURE, FabricBlockSettings.create().solid().instrument(Instrument.BASS).noCollision().strength(1.0F)
                    .burnable()));

    public static final Block STANDING_EVERBLOOM_SIGN = Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, "everbloom_standing_sign"),
            new SMPUSignBlock(EVERBLOOM_SIGN_TEXTURE, FabricBlockSettings.create().solid().instrument(Instrument.BASS).noCollision().strength(1.0F)
                    .burnable()));
    public static final Block WALL_EVERBLOOM_SIGN = Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, "everbloom_wall_sign"),
            new SMPUWallSignBlock(EVERBLOOM_SIGN_TEXTURE, FabricBlockSettings.create().solid().instrument(Instrument.BASS).noCollision().strength(1.0F)
                    .burnable()));

    public static final Block STANDING_HAWTHORNE_SIGN = Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, "hawthorne_standing_sign"),
            new SMPUSignBlock(HAWTHORNE_SIGN_TEXTURE, FabricBlockSettings.create().solid().instrument(Instrument.BASS).noCollision().strength(1.0F)
                    .burnable()));
    public static final Block WALL_HAWTHORNE_SIGN = Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, "hawthorne_wall_sign"),
            new SMPUWallSignBlock(HAWTHORNE_SIGN_TEXTURE, FabricBlockSettings.create().solid().instrument(Instrument.BASS).noCollision().strength(1.0F)
                    .burnable()));

    public static final Block AVALORE_PLANKS = registerBlock("avalore_planks", new Block(FabricBlockSettings.create().instrument(Instrument.BASS)
            .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block EVERBLOOM_PLANKS = registerBlock("everbloom_planks", new Block(FabricBlockSettings.create().instrument(Instrument.BASS)
            .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block HAWTHORNE_PLANKS = registerBlock("hawthorne_planks", new Block(FabricBlockSettings.create().instrument(Instrument.BASS)
            .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final BlockFamily AVALORE_FAMILY = BlockFamilies.register(ModBlocks.AVALORE_PLANKS)
            .sign(ModBlocks.STANDING_AVALORE_SIGN, ModBlocks.WALL_AVALORE_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily EVERBLOOM_FAMILY = BlockFamilies.register(ModBlocks.EVERBLOOM_PLANKS)
            .sign(ModBlocks.STANDING_EVERBLOOM_SIGN, ModBlocks.WALL_EVERBLOOM_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily HAWTHORNE_FAMILY = BlockFamilies.register(ModBlocks.HAWTHORNE_PLANKS)
            .sign(ModBlocks.STANDING_HAWTHORNE_SIGN, ModBlocks.WALL_HAWTHORNE_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SMPU_Factions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(SMPU_Factions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        SMPU_Factions.LOGGER.info("Registering ModBlocks for " + SMPU_Factions.MOD_ID);
    }

}
