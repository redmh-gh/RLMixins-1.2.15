package rlmixins.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

public class ModelSteelArmor extends ModelBiped {
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightFoot;
    public ModelRenderer LeftFoot;

    public ModelSteelArmor(float scale) {
        super(scale, 0, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 64, -5.0F, -9.25F, -3.0F, 10, 8, 8, 0.0F, false));
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 80, 4.0F, -5.25F, -5.0F, 1, 4, 2, 0.0F, false));
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 64, -5.0F, -5.25F, -5.0F, 1, 4, 2, 0.0F, false));
        bipedHead.cubeList.add(new ModelBox(bipedHead, 36, 85, -5.0F, -9.25F, -5.0F, 10, 4, 2, 0.0F, false));
        bipedHead.cubeList.add(new ModelBox(bipedHead, 21, 81, -1.0F, -9.75F, -5.5F, 2, 7, 11, 0.0F, false));

        bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 80, -5.0F, 0.0F, -3.0F, 10, 6, 6, 0.0F, false));
        bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 99, -5.0F, 5.9F, -2.5F, 10, 6, 5, 0.0F, false));

        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 36, 64, -3.9F, -2.75F, -3.0F, 5, 5, 6, 0.0F, false));
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 46, 94, -3.65F, 4.25F, -2.5F, 5, 4, 5, 0.0F, false));

        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 30, 99, -1.1F, -2.75F, -3.0F, 5, 5, 6, 0.0F, true));
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 22, 110, -1.35F, 4.25F, -2.5F, 5, 4, 5, 0.0F, true));

        RightLeg = bipedRightLeg;
        LeftLeg = bipedLeftLeg;
        RightFoot = bipedRightLeg;
        LeftFoot = bipedLeftLeg;

        RightLeg.cubeList.add(new ModelBox(RightLeg, 108, 100, -2.7F, 0.1F, -2.5F, 5, 9, 5, 0.0F, false));

        LeftLeg.cubeList.add(new ModelBox(LeftLeg, 108, 114, -2.3F, 0.1F, -2.5F, 5, 9, 5, 0.0F, true));

        RightFoot.cubeList.add(new ModelBox(RightFoot, 0, 92, -2.71F, 6.25F, -3.0F, 5, 2, 2, 0.0F, false));
        RightFoot.cubeList.add(new ModelBox(RightFoot, 36, 75, -2.71F, 8.25F, -3.0F, 5, 4, 6, 0.0F, false));

        LeftFoot.cubeList.add(new ModelBox(LeftFoot, 28, 64, -2.29F, 6.25F, -3.0F, 5, 2, 2, 0.0F, false));
        LeftFoot.cubeList.add(new ModelBox(LeftFoot, 0, 110, -2.29F, 8.25F, -3.0F, 5, 4, 6, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
                                  float headPitch, float scaleFactor, Entity entityIn) {
        if(entityIn instanceof EntityArmorStand) {
            EntityArmorStand entityarmorstand = (EntityArmorStand) entityIn;
            this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
            this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
            this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
            this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
            this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
            this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
            this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
            this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
            this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
            this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
            this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
            this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
            this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
            this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
            this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
            this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
            this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
            this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
            this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
            this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
            this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
            copyModelAngles(this.bipedHead, this.bipedHeadwear);
        } else
            super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor,
                    entityIn);
    }
}