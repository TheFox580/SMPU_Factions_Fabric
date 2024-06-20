package fr.thefox580.smpu_factions.custom;

import fr.thefox580.smpu_factions.SMPU_Factions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SMPU_FACTIONS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(SMPU_Factions.MOD_ID,
            "smpu_factions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smpu_factions"))
                    .icon(() -> new ItemStack(ModItems.AVA_APPLE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AVA_APPLE);
                        entries.add(ModItems.BLOOMING_BERRIES);
                        entries.add(ModItems.THORNY_THISTLE);

                        entries.add(ModItems.AVALORE_ADOPTION_CERTIFICATE);
                        entries.add(ModItems.EVERBLOOM_ADOPTION_CERTIFICATE);
                        entries.add(ModItems.HAWTHORNE_ADOPTION_CERTIFICATE);

                        entries.add(ModItems.AVALORE_SIGN);
                        entries.add(ModItems.EVERBLOOM_SIGN);
                        entries.add(ModItems.HAWTHORNE_SIGN);

                    }).build());

    public static void registerItemGroups(){
        SMPU_Factions.LOGGER.info("Registering Item Groups for " + SMPU_Factions.MOD_ID);
    }

}
