package fr.thefox580.smpu_factions.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import fr.thefox580.smpu_factions.custom.UnitySignBlock;
import fr.thefox580.smpu_factions.custom.UnityWallSignBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.block.entity.SignText;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(SignBlockEntity.class)
public abstract class SignBlockEntityMixin extends BlockEntity {
    public SignBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @ModifyReturnValue(method = "createText", at = @At("RETURN"))
    private SignText smpu$makeFactionSignTextWhite(SignText original) {
        if ((this.getCachedState().getBlock() instanceof UnitySignBlock) || this.getCachedState().getBlock() instanceof UnityWallSignBlock) {
            return original.withColor(DyeColor.WHITE);
        }

        return original;
    }
}
