package socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2018/9/19 23:28
 * @Created by HP
 */
public class Client {
    private Socket socket;
    Client(){
        try {
            socket = new Socket("localhost", 8000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //与服务器交互
    public void start() {
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
