package net.tapca.pion.containers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;


public class AmuletContainer extends Container {
    private final PlayerEntity playerEntity;
    private final IItemHandler playerInventory;

    public AmuletContainer(int windowId, World world, PlayerEntity playerEntity,
                           PlayerInventory playerInventory, PlayerEntity player) {
        super(type, windowId);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);

        layoutPlayerInventorySlots( 8, 86);

        addSlot(new SlotItemHandler(,0,80,31));
    }


    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return (playerEntity.inventory.getCurrentItem().getItem() == );
    }

    private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx) {
        for (int i = 0; i < amount; i++) {
            addSlot(new SlotItemHandler(handler, index, x, y));
            x += dx;
            index++;
        }

        return index;
    }

    private int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0; j < verAmount; j++) {
            index = addSlotRange(handler, index, x, y, horAmount, dx);
            y += dy;
        }

        return index;
    }

    private void layoutPlayerInventorySlots(int leftCol, int topRow) {
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }
}
