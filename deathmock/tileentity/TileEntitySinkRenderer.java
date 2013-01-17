package com.tempestgamers.deathmock.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import com.tempestgamers.deathmock.client.model.TileSinkModel;
import com.tempestgamers.deathmock.tileentity.TileSink;

/**
 * RenderTileSink
 * 
 * Renders the Calcinator in game as a TESR (Tile Entity Special Render)
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class TileEntitySinkRenderer extends TileEntitySpecialRenderer {

    static final float scale = (float) (1.0 / 16.0);
    
    private TileSinkModel modelsink = new TileSinkModel(scale);

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {

    	 modelsink.render((TileSink) tileEntity, x, y, z);
    }

}
