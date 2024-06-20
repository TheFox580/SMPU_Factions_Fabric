package fr.thefox580.smpu_factions.datagen;

import fr.thefox580.smpu_factions.custom.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool avalorePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AVALORE_PLANKS);
        avalorePool.family(ModBlocks.AVALORE_FAMILY);

        BlockStateModelGenerator.BlockTexturePool everbloomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EVERBLOOM_PLANKS);
        everbloomPool.family(ModBlocks.EVERBLOOM_FAMILY);

        BlockStateModelGenerator.BlockTexturePool hawthornPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HAWTHORNE_PLANKS);
        hawthornPool.family(ModBlocks.HAWTHORNE_FAMILY);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
