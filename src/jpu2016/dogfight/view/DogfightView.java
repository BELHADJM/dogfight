package jpu2016.dogfight.view;

import javax.swing.JOptionPane;

import jpu2016.dogfight.controler.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IviewSystem, Runnable {

	
	
public DogfightView(final IOrderPerformer orderPerformer, final IDogfightModel dogfightModel,final Observable observable) 
{
   
    }

	public void run() {	
	}
	
	@Override
	 public final void displayMessage(final String message) {
       JOptionPane.showMessageDialog(null, message);
   }


	@Override
	public void closeAll() {		
	}

}
