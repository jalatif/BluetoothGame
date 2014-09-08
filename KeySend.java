import java.awt.*;
import java.awt.event.KeyEvent;

public class KeySend{

	public static void main(String args[]){
		try {
        	Robot robot = new Robot();

        	// Simulate a mouse click
        	//robot.mousePress(InputEvent.BUTTON1_MASK);
        	//robot.mouseRelease(InputEvent.BUTTON1_MASK);

        	// Simulate a key press
			Thread.sleep(3000);
        	robot.keyPress(KeyEvent.VK_UP);
			Thread.sleep(5000);
  		    robot.keyRelease(KeyEvent.VK_UP);

		}catch (AWTException e) {
        	e.printStackTrace();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		

	}
}
