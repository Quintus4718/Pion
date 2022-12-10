package net.tapca.pion.items.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SnowballItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.tapca.pion.entities.ModEntityTypes;
import net.tapca.pion.entities.custom.TeemBombEntity;
import net.tapca.pion.sounds.ModSoundEvents;

public class TeemBomb extends Item {
    public TeemBomb(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), ModSoundEvents.ENTITY_TEEMBOMB_THROW.get(), SoundCategory.NEUTRAL, 0.5F, 0.9f);
        if (!worldIn.isRemote) {
            TeemBombEntity teembombentity = new TeemBombEntity(ModEntityTypes.TEEM_BOMB.get(), worldIn);
            teembombentity.setDirectionAndMovement(teembombentity, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1f, 1.0F);
            worldIn.addEntity(teembombentity);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
