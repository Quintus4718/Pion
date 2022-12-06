package net.tapca.pion.items;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tapca.pion.PionMod;
import net.tapca.pion.entities.ModEntityTypes;
import net.tapca.pion.items.custom.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PionMod.MOD_ID);

    public static final RegistryObject<Item> AMULET = ITEMS.register("amulet",
            () -> new Amulet(new Item.Properties().group(ModItemGroup.PION_GROUP).maxStackSize(1)));

    public static final RegistryObject<Item> SPROUTLING_SEED = ITEMS.register("sproutling_seed",
            () -> new Item(new Item.Properties().group(ModItemGroup.PION_GROUP)));

    public static final RegistryObject<Item> GOLDEN_SPROUTLING_SEED = ITEMS.register("golden_sproutling_seed",
            () -> new Item(new Item.Properties().group(ModItemGroup.PION_GROUP)));

    public static final RegistryObject<Item> SPROUTLING_GEM = ITEMS.register("sproutling_gem",
            () -> new Item(new Item.Properties().group(ModItemGroup.PION_GROUP).maxStackSize(1)));

    public static final RegistryObject<Item> DECAY_GEM = ITEMS.register("decay_gem",
            () -> new Item(new Item.Properties().group(ModItemGroup.PION_GROUP).maxStackSize(1)));

    public static final RegistryObject<Item> WATER_GEM = ITEMS.register("water_gem",
            () -> new Item(new Item.Properties().group(ModItemGroup.PION_GROUP).maxStackSize(1)));

    public static final RegistryObject<Item> TEEM_BOMB = ITEMS.register("teem_bomb",
            () -> new TeemBomb(new Item.Properties().group(ModItemGroup.PION_GROUP).maxStackSize(16)));


    public static final RegistryObject<Item> SPROUTLING_SPAWN_EGG = ITEMS.register("sproutling_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SPROUTLING, 0xf8fab6, 0xdee23c,
                    new Item.Properties().maxStackSize(64).group(ModItemGroup.PION_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}