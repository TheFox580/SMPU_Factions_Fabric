package fr.thefox580.smpu_factions.datagen;

import fr.thefox580.smpu_factions.custom.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
            .add(ModBlocks.STANDING_AVALORE_SIGN, ModBlocks.STANDING_EVERBLOOM_SIGN, ModBlocks.STANDING_HAWTHORNE_SIGN);

        this.getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
            .add(ModBlocks.WALL_AVALORE_SIGN, ModBlocks.WALL_EVERBLOOM_SIGN, ModBlocks.WALL_HAWTHORNE_SIGN);

        this.getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(ModBlocks.AVALORE_PLANKS, ModBlocks.EVERBLOOM_PLANKS, ModBlocks.HAWTHORNE_PLANKS);
    }
}
