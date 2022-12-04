package net.tapca.pion.entity.model;// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.ZombieEntity;
import net.tapca.pion.entity.custom.SproutlingEntity;

public class SproutlingModel<T extends SproutlingEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 72;
		textureHeight = 56;

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 1.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
		cube_r1.setTextureOffset(0, 0).addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.0F, -1.5708F);
		cube_r2.setTextureOffset(0, 0).addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 3.1416F, 0.0F, -1.5708F);
		cube_r3.setTextureOffset(0, 0).addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.5708F, 0.0F, -1.5708F);
		cube_r4.setTextureOffset(0, 0).addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.5708F, 0.0F, 1.5708F);
		cube_r7.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(48, 0).addBox(-4.0F, -23.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 32).addBox(-5.0F, -23.0F, -4.0F, 8.0F, 16.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 38).addBox(-6.0F, -22.0F, -5.0F, 10.0F, 8.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}