package fr.thefox580.smpu_factions.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import fr.thefox580.smpu_factions.custom.UnitySignBlock;
import fr.thefox580.smpu_factions.custom.UnityWallSignBlock;
import net.minecraft.block.AbstractSignBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.block.entity.SignText;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.model.Model;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.ColorHelper;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SignBlockEntityRenderer.class)
public class SignBlockEntityRendererMixin {
    @Unique private final ThreadLocal<SignBlockEntity> signBlockEntity = new ThreadLocal<>();

    @Inject(method = "render(Lnet/minecraft/block/entity/SignBlockEntity;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/block/BlockState;Lnet/minecraft/block/AbstractSignBlock;Lnet/minecraft/block/WoodType;Lnet/minecraft/client/model/Model;)V", at = @At("HEAD"))
    private void smpu$storeBlockEntityValue(SignBlockEntity entity, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BlockState state, AbstractSignBlock block, WoodType woodType, Model model, CallbackInfo ci) {
        this.signBlockEntity.set(entity);
    }

    @Inject(method = "render(Lnet/minecraft/block/entity/SignBlockEntity;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/block/BlockState;Lnet/minecraft/block/AbstractSignBlock;Lnet/minecraft/block/WoodType;Lnet/minecraft/client/model/Model;)V", at = @At("TAIL"))
    private void smpu$clearBlockEntityValue(SignBlockEntity entity, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BlockState state, AbstractSignBlock block, WoodType woodType, Model model, CallbackInfo ci) {
        this.signBlockEntity.remove();
    }

    @WrapOperation(method = "renderText", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/OrderedText;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I"))
    private int smpu$makeFactionsWhiteTextLighter(TextRenderer instance, OrderedText text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, TextRenderer.TextLayerType layerType, int backgroundColor, int light, Operation<Integer> original, @Local(argsOnly = true) SignText signText) {
        var sign = this.signBlockEntity.get();
        if (
            signText.getColor() == DyeColor.WHITE && sign != null && sign.getCachedState() != null &&
            (sign.getCachedState().getBlock() instanceof UnitySignBlock || sign.getCachedState().getBlock() instanceof UnityWallSignBlock)
        ) {
            double d = 0.7;
            int i = signText.getColor().getSignColor();
            int j = (int)((double) ColorHelper.Argb.getRed(i) * d);
            int k = (int)((double) ColorHelper.Argb.getGreen(i) * d);
            int l = (int)((double) ColorHelper.Argb.getBlue(i) * d);
            color = ColorHelper.Argb.getArgb(0, j, k, l);
        }

        return original.call(instance, text, x, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light);
    }
}
