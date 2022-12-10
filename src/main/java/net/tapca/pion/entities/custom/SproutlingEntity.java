package net.tapca.pion.entities.custom;


import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tapca.pion.items.ModItems;

import javax.annotation.Nullable;

public class SproutlingEntity extends AnimalEntity {


    public SproutlingEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);

    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 0.7D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 0.3));
        this.goalSelector.addGoal(3, new TemptGoal(this, 0.3D, Ingredient.fromItems(Items.BONE_MEAL), false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 0.3D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.3D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(1);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_GHAST_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_BAT_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.BLOCK_BAMBOO_HIT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        super.playSound(SoundEvents.ENTITY_ZOGLIN_ANGRY, 0.15F, 1.0F);
    }

    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
        return null;
    }

    //Attempted Particles, DON'T DELETE
    @Override
    public void tick() {
        float chance = 0.5f;
        if (chance < rand.nextFloat() && dead == false) {
            getEntityWorld().addParticle(ParticleTypes.HAPPY_VILLAGER, getPosX() + rand.nextDouble() - 0.5d, getPosY() + 0.5d,
                    getPosZ() + rand.nextDouble() - 0.5d, 0d, -1.0d, 0d);
        }
        super.tick();
    }
}
