package jpu2016.dogfight.view;

import java.io.IOException;

import javax.swing.JOptionPane;

public class DogfightView implements IviewSystem, Runnable {

	
	
public DogfightView(final IOrderPerfomer orderPerformer, final IDogfightModel dogfightModel,final Observable observable) throws IOException {
   
    }

	@Override
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
