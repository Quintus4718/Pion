package net.tapca.pion.entities.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;

public class TeemBombEntity extends ThrowableEntity {

    protected TeemBombEntity(EntityType<? extends ThrowableEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerData() {

    }
}
