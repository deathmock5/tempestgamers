package com.tempestgamers.deathmock.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;

import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.tileentity.TileSink;

/**
 * TileModelSink
 * 
 * Model for the sink
 * 
 * @author deathmock5
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class TileSinkModel extends ModelBase
{
	 private static final int TEXTURE_HEIGHT = 64;
	 private static final int TEXTURE_WIDTH = 64;
	 private ModelRenderer bace;
	 private ModelRenderer frontside;
	 private ModelRenderer leftside;
	 private ModelRenderer rightside;
	 private ModelRenderer backside;
	 private ModelRenderer insidebotom;
	 private ModelRenderer outsidebotom;
	 private ModelRenderer spigitbace;
	 private ModelRenderer spigit;
	 private float scale;
	public TileSinkModel(float scale)
	{
		this.scale = scale;
		this.bace = new ModelRenderer(this,0,0);
		//frontside
		
		this.frontside = new ModelRenderer(this, 24, 48);
		this.frontside.setTextureSize(64, 64);
	    this.frontside.addBox(0F, 0F, 13F, 16, 15, 1);
	    
	    this.leftside = new ModelRenderer(this, 0, 38);
	    this.leftside.setTextureSize(64, 64);
	    this.leftside.addBox(15F, 0F, 2F, 1, 15, 11);
	    
	    this.rightside = new ModelRenderer(this, 0, 38);
	    this.rightside.setTextureSize(64, 64);
	    this.rightside.addBox(0F, 0F, 2F, 1, 15, 11);
	    
	    this.backside = new ModelRenderer(this, 0, 12);
	    this.backside.setTextureSize(64, 64);
	    this.backside.addBox(0, 0, 0, 16, 16, 2);
	    
	    this.insidebotom = new ModelRenderer(this, 0, 0);
	    this.insidebotom.setTextureSize(64, 64);
	    this.insidebotom.addBox(1F, 10F, 2F, 14, 1, 11);
	    this.insidebotom.rotationPointY = 20F;
	    this.insidebotom.rotationPointZ = 15F;
	    this.insidebotom.rotateAngleX = (float)Math.PI;
	    
	    this.outsidebotom = new ModelRenderer(this, 0, 0);
	    this.outsidebotom.setTextureSize(64, 64);
	    this.outsidebotom.addBox(1F, 0F, 2F, 14, 1, 11);
	    this.outsidebotom.rotationPointY = 1F;
	    this.outsidebotom.rotationPointZ = 15F;
	    this.outsidebotom.rotateAngleX = (float)Math.PI;
	    
	    this.spigitbace = new ModelRenderer(this, 24, 45);
	    this.spigitbace.setTextureSize(64, 64);
	    this.spigitbace.addBox(5F, 12F, 2F, 6, 1, 1);
	   
	    this.spigit = new ModelRenderer(this, 24, 42);
	    this.spigit.setTextureSize(64, 64);
	    this.spigit.addBox(7F, 13F, 2F, 2, 1, 4);
	    
	    this.bace.addChild(frontside);
	    this.bace.addChild(backside);
	    this.bace.addChild(leftside);
	    this.bace.addChild(rightside);
	    this.bace.addChild(insidebotom);
	    this.bace.addChild(outsidebotom);
	    this.bace.addChild(spigitbace);
	    this.bace.addChild(spigit);
	    
	}

	public void render(TileSink tileSink,double x,double y, double z)
	{
			this.bace.rotateAngleY= (float) (Math.PI / 2);
		 GL11.glPushMatrix();
		 //GL11.glDisable(GL11.GL_LIGHTING);
		 
		 ForgeHooksClient.bindTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.SINK_MODEL_TEXTURE, 0);
		 int angle = 0;
		 switch(tileSink.worldObj.getBlockMetadata(tileSink.xCoord, tileSink.yCoord, tileSink.zCoord))
		 {
		 case 2:
			 	GL11.glTranslated(x+1, y, z+1);//perfict
				angle = 90;
				break;
			case 3:
				GL11.glTranslated(x, y ,z);//perfict
				angle = 270;
				break;
			case 4:
				GL11.glTranslated(x+1, y , z);//perfict
				angle = 180;
				break;
			case 5:
				GL11.glTranslated(x, y , z+1);//perfict
				angle = 0;
				break;
		 }
		 GL11.glRotatef(angle, 0, 1, 0);
		 bace.render(scale);
		
		 //GL11.glEnable(GL11.GL_LIGHTING);
		 GL11.glPopMatrix();
	}

	public void render(float scale)
	{
		bace.render(scale);
	}
	private void setRotation(ModelRenderer model, float x, float y, float z)
{
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
}

}