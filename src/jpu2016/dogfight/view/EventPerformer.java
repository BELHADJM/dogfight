package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;
import jpu2016.dogfight.controler.IOrderPerformer;
import jpu2016.dogfight.controler.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {

public EventPerformer(IOrderPerformer orderPerformer) {
	}
	
	@Override
	public void eventPerform(KeyEvent e) {	
	}
	
	private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder = null;
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_LEFT:
                break;
            default:
                break;
        }
        return userOrder;
    }
}
