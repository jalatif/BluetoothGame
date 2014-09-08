/**
 * Created with IntelliJ IDEA.
 * User: jalatif
 * Date: 4/20/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */

public class RemoteBluetoothServer{

    public static void main(String[] args) {
        Thread waitThread = new Thread(new WaitThread());
        waitThread.start();
    }
}
