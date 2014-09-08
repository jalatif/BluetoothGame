/**
 * Created with IntelliJ IDEA.
 * User: jalatif
 * Date: 4/20/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */

import javax.microedition.io.StreamConnection;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.InputStream;

public class ProcessConnectionThread implements Runnable{

    private StreamConnection mConnection;

    // Constant that indicate command from devices
    private static final int EXIT_CMD = -1;
    private static final int KEY_RIGHT = 1;
    private static final int KEY_LEFT = 2;
    private static final int KEY_UP = 3;
    private static final int KEY_DOWN = 4;
    private static final int KEY_STOP = 5;
    private int key_pressed = 0;


    public ProcessConnectionThread(StreamConnection connection)
    {
        mConnection = connection;
    }

    @Override
    public void run() {
        try {
            // prepare to receive data
            InputStream inputStream = mConnection.openInputStream();

            System.out.println("waiting for input");

            while (true) {
                int command = inputStream.read();

                if (command == EXIT_CMD)
                {
                    System.out.println("finish process");
                    break;
                }
                processCommand(command);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Process the command from client
     * @param command the command code
     */
    private void processCommand(int command) {
        try {
            Robot robot = new Robot();
            int time = 100;
            System.out.println("Jalatif Command = " + command);
            /*switch (command) {
                case KEY_RIGHT:
                    if (key_pressed != 0 && key_pressed != KeyEvent.VK_UP && key_pressed != KeyEvent.VK_DOWN)
                        robot.keyRelease(key_pressed);
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    key_pressed = KeyEvent.VK_RIGHT;
                    System.out.println("Right");
                    //Thread.sleep(time);
                    //robot.keyRelease(KeyEvent.VK_RIGHT);
                    break;
                case KEY_LEFT:
                    if (key_pressed != 0 && key_pressed != KeyEvent.VK_UP && key_pressed != KeyEvent.VK_DOWN)
                        robot.keyRelease(key_pressed);
                    robot.keyPress(KeyEvent.VK_LEFT);
                    key_pressed = KeyEvent.VK_LEFT;
                    System.out.println("Left");
                    //Thread.sleep(time);
                    //robot.keyRelease(KeyEvent.VK_LEFT);
                    break;
                case KEY_UP:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    robot.keyPress(KeyEvent.VK_UP);
                    key_pressed = KeyEvent.VK_UP;
                    System.out.println("Up");
                    //Thread.sleep(time);
                    //robot.keyRelease(KeyEvent.VK_UP);
                    break;
                case KEY_DOWN:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    robot.keyPress(KeyEvent.VK_DOWN);
                    key_pressed = KeyEvent.VK_DOWN;
                    System.out.println("Down");
                    //Thread.sleep(time);
                    //robot.keyRelease(KeyEvent.VK_DOWN);
                    break;
                case KEY_STOP:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = 0;
                    System.out.println("Stop");
                    break;
            }   */

            int key = 0;
            switch(command){
                case 1:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_Q;
                    robot.keyPress(key_pressed);
                    break;
                case 2:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_E;
                    robot.keyPress(key_pressed);
                    break;
                case 3:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_SHIFT;
                    robot.keyPress(key_pressed);
                    break;
                case 4:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_SPACE;
                    robot.keyPress(key_pressed);
                    break;
                case 5:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_UP;
                    robot.keyPress(key_pressed);
                    break;
                case 6:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_W;
                    robot.keyPress(key_pressed);
                    break;
                case 7:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_LEFT;
                    robot.keyPress(key_pressed);
                    break;
                case 8:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_RIGHT;
                    robot.keyPress(key_pressed);
                    break;
                case 9:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_ESCAPE;
                    robot.keyPress(key_pressed);
                    break;
                case 10:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_ENTER;
                    robot.keyPress(key_pressed);
                    break;
                case 11:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_A;
                    robot.keyPress(key_pressed);
                    break;
                case 12:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_D;
                    robot.keyPress(key_pressed);
                    break;
                case 13:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_DOWN;
                    robot.keyPress(key_pressed);
                    break;
                case 14:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    key_pressed = KeyEvent.VK_S;
                    robot.keyPress(key_pressed);
                    break;
                default:
                    if (key_pressed != 0)
                        robot.keyRelease(key_pressed);
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

