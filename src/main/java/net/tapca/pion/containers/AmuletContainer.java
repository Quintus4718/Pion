package net.tapca.pion.containers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraftforge.items.IItemHandler


public class AmuletContainer extends Container {
    private final PlayerEntity playerEntity;
    private final IItemHandler playerInventory;

    public AmuletContainer(int windowID, World world, ) {
        super();
        this.playerInventory = playerInventory;
    }


    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return false;
    }
}
