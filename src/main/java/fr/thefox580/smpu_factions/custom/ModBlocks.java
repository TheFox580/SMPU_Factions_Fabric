package fr.thefox580.smpu_factions.custom;

import fr.thefox580.smpu_factions.Unity_Faction;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Identifier AVALORE_SIGN_TEXTURE = Identifier.of(Unity_Faction.MOD_ID,
            "entity/signs/avalore");

    public static final Identifier EVERBLOOM_SIGN_TEXTURE = Identifier.of(Unity_Faction.MOD_ID,
            "entity/signs/everbloom");

    public static final Identifier HAWTHORNE_SIGN_TEXTURE = Identifier.of(Unity_Faction.MOD_ID,
            "entity/signs/hawthorne");

    public static final Block STANDING_AVALORE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, "avalore_standing_sign"),
            new UnitySignBlock(AVALORE_SIGN_TEXTURE, Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F)
                    .burnable()));
    public static final Block WALL_AVALORE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, "avalore_wall_sign"),
            new UnityWallSignBlock(AVALORE_SIGN_TEXTURE, Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F)
                    .burnable()));

    public static final Block STANDING_EVERBLOOM_SIGN = Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, "everbloom_standing_sign"),
            new UnitySignBlock(EVERBLOOM_SIGN_TEXTURE, Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F)
                    .burnable()));
    public static final Block WALL_EVERBLOOM_SIGN = Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, "everbloom_wall_sign"),
            new UnityWallSignBlock(EVERBLOOM_SIGN_TEXTURE, Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F)
                    .burnable()));

    public static final Block STANDING_HAWTHORNE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, "hawthorne_standing_sign"),
            new UnitySignBlock(HAWTHORNE_SIGN_TEXTURE, Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F)
                    .burnable()));
    public static final Block WALL_HAWTHORNE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, "hawthorne_wall_sign"),
            new UnityWallSignBlock(HAWTHORNE_SIGN_TEXTURE, Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F)
                    .burnable()));

    public static final Block AVALORE_PLANKS = registerBlock("avalore_planks", new Block(Settings.create().instrument(NoteBlockInstrument.BASS)
            .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block EVERBLOOM_PLANKS = registerBlock("everbloom_planks", new Block(Settings.create().instrument(NoteBlockInstrument.BASS)
            .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block HAWTHORNE_PLANKS = registerBlock("hawthorne_planks", new Block(Settings.create().instrument(NoteBlockInstrument.BASS)
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
        return Registry.register(Registries.BLOCK, Identifier.of(Unity_Faction.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(Unity_Faction.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Unity_Faction.LOGGER.info("Registering ModBlocks for " + Unity_Faction.MOD_ID);
    }

}
