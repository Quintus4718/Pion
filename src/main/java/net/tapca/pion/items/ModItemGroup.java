package net.tapca.pion.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup PION_GROUP = new ItemGroup("PionTab") {
        @Override
        public ItemStack createIcon() {

            return new ItemStack(ModItems.AMULET_T1.get());
        }
    };
}
