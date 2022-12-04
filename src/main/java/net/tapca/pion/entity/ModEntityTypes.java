package net.tapca.pion.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tapca.pion.PionMod;
import net.tapca.pion.entity.custom.SproutlingEntity;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, PionMod.MOD_ID);

    public static final RegistryObject<EntityType<SproutlingEntity>> SPROUTLING =
            ENTITY_TYPES.register("sproutling", () -> EntityType.Builder.create(SproutlingEntity::new, EntityClassification.CREATURE).size(1f, 1f)
                    .build(new ResourceLocation(PionMod.MOD_ID, "sproutling").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
