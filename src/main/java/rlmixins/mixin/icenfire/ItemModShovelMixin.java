package rlmixins.mixin.icenfire;

import com.github.alexthe666.iceandfire.item.ItemModShovel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemModShovel.class)
public abstract class ItemModShovelMixin {

    /**
     * Cancel it attempting to attack entities a second time which fails because of IFrames, directly modify damage in BetterCombat.HelpersMixin
     */
    @Redirect(
            method = "hitEntity",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z")
    )
    public boolean rlmixins_iceAndFireItemModShovel_hitEntity(EntityLivingBase instance, DamageSource source, float b0) {
        return false;
    }
}