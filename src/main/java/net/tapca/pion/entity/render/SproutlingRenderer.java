package net.tapca.pion.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import net.tapca.pion.PionMod;
import net.tapca.pion.entity.custom.SproutlingEntity;
import net.tapca.pion.entity.model.*;

public class SproutlingRenderer extends MobRenderer<SproutlingEntity, SproutlingModel<SproutlingEntity>>{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(PionMod.MOD_ID, "textures/entity/sproutling.png");

    public SproutlingRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SproutlingModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(SproutlingEntity entity) {
        return TEXTURE;
    }

}
