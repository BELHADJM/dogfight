package jpu2016.dogfight.view;

import javax.swing.JOptionPane;

public class DogfightView implements IviewSystem, Runnable {

	
	
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
