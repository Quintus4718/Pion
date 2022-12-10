package net.tapca.pion.sounds;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tapca.pion.PionMod;

public class ModSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PionMod.MOD_ID);

    public static final RegistryObject<SoundEvent> ENTITY_TEEMBOMB_THROW = registerSoundEvent("teem_bomb_throw");
    public static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(PionMod.MOD_ID, name)));
    }
    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
