package jpu2016.gameframe;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import jpu2016.dogfight.view.Observable;

import java.awt.event.*;
import java.io.IOException;

public class GameFrame  extends JFrame implements KeyListener {
	
	public GameFrame(String title, IEventPerformer performer,IGraphicsBuilder graphicBuilder,Observable observable) {
	}

	public final void keyPressed(final KeyEvent keyEvent) {
        try {
            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
        } catch (final IOException exception) {
            exception.printStackTrace();
        }
    }

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
	}

}
