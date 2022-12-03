package net.tapca.pion.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tapca.pion.PionMod;
import net.tapca.pion.items.custom.Amulet_T1;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PionMod.MOD_ID);

    public static final RegistryObject<Item> AMULET_T1 = ITEMS.register("amulet_t1",
            () -> new Amulet_T1(new Item.Properties().group(ModItemGroup.PION_GROUP).maxStackSize(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}