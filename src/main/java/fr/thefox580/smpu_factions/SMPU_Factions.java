package fr.thefox580.smpu_factions;

import fr.thefox580.smpu_factions.custom.ModBlocks;
import fr.thefox580.smpu_factions.custom.ModFood;
import fr.thefox580.smpu_factions.custom.ModItemGroup;
import fr.thefox580.smpu_factions.custom.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMPU_Factions implements ModInitializer {
	public static final String MOD_ID = "smpu_factions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();

	}
}