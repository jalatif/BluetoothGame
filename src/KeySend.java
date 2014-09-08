/**
 * Created with IntelliJ IDEA.
 * User: jalatif
 * Date: 4/20/13
 * Time: 4:54 AM
 * To change this template use File | Settings | File Templates.
 */

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
            robot.keyPress(KeyEvent.VK_UP);
            Thread.sleep(5000);
            robot.keyRelease(KeyEvent.VK_A);

        }catch (AWTException e) {
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
