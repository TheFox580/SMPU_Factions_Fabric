package fr.thefox580.smpu_factions;

import fr.thefox580.smpu_factions.datagen.ModBlockTagProvider;
import fr.thefox580.smpu_factions.datagen.ModItemTagProvider;
import fr.thefox580.smpu_factions.datagen.ModLootTableProvider;
import fr.thefox580.smpu_factions.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SMPU_FactionsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
	}
}
