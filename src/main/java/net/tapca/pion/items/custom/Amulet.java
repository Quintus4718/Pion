package net.tapca.pion.items.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class Amulet extends Item implements ICurioItem {

    public Amulet(Properties properties) {
        super(properties);

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}