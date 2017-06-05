package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.*;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;


public class GraphicsBuilder implements IGraphicsBuilder {

public 	GraphicsBuilder(IDogfightModel dogfightModel) {
}
	
	public void applyModelToGraphic(Graphics graphics) {
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
		
	}

    private void buildEmptySky() {
    }
    
    public void drawMobile(IMobile mobile,Graphics graphics, ImageObserver observer) {
	}
	
	@Override
	public int GetGlobalWidth() {
		return  1 ;
		
	}

	@Override
	public int GetGlobalHeight() {
		return  1 ;

	}

}
