package fr.thefox580.smpu_factions.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
    @Unique
    private void init(CallbackInfo info) {
        // This code is injected into the start of MinecraftServer.loadLevel()V
    }
}