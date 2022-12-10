package net.tapca.pion.items.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.tapca.pion.sounds.ModSoundEvents;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.Objects;

public class Amulet extends Item implements ICurioItem {

    public Amulet(Properties properties) {
        super(properties);

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        PlayerEntity player = (PlayerEntity) livingEntity;

        if(!player.world.isRemote()) {
            if(this.getTags().contains("water_gem")){
                boolean hasPlayerDolphinsGrace = !Objects.equals(player.getActivePotionEffect(Effects.DOLPHINS_GRACE), null);
                if(!hasPlayerDolphinsGrace){
                    player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 200));
                }
            }
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
}