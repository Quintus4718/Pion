package net.tapca.pion.entities.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.tapca.pion.PionMod;
import net.tapca.pion.entities.model.SproutlingModel;
import net.tapca.pion.entities.custom.SproutlingEntity;

public class SproutlingRenderer extends MobRenderer<SproutlingEntity, SproutlingModel<SproutlingEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(PionMod.MOD_ID, "textures/entity/sproutling.png");

    public SproutlingRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SproutlingModel<>(), 0.5F);
    }

    public ResourceLocation getEntityTexture(SproutlingEntity entity) {
        return TEXTURE;
    }
    
}
