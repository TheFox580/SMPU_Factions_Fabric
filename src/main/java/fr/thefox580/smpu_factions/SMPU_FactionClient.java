package fr.thefox580.smpu_factions;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import fr.thefox580.smpu_factions.custom.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

public class SMPU_FactionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.AVALORE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.EVERBLOOM_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.HAWTHORNE_SIGN_TEXTURE));

    }
}
