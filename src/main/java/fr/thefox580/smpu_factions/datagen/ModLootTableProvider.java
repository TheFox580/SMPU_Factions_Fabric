package fr.thefox580.smpu_factions.datagen;

import fr.thefox580.smpu_factions.custom.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.STANDING_AVALORE_SIGN);
        addDrop(ModBlocks.STANDING_EVERBLOOM_SIGN);
        addDrop(ModBlocks.STANDING_HAWTHORNE_SIGN);

        addDrop(ModBlocks.WALL_AVALORE_SIGN);
        addDrop(ModBlocks.WALL_EVERBLOOM_SIGN);
        addDrop(ModBlocks.WALL_HAWTHORNE_SIGN);

    }
}
