package net.tapca.pion.containers;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tapca.pion.PionMod;
import net.tapca.pion.items.custom.Amulet;

public class ModContainers {

    public static DeferredRegister<ContainerType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, PionMod.MOD_ID);

    public static final RegistryObject<ContainerType<AmuletContainer>> AMULET_CONTAINER
            = CONTAINERS.register("pion_amulet_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                World world = inv.player.getEntityWorld();
                return new AmuletContainer(windowId, world, inv.player, inv);

            })));


    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
