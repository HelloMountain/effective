package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server
 * @Description socket 编程
 * @Date 2018/9/19 21:49
 * @Created by HP
 */
public class Server {
    private ServerSocket serverSocket;

    public void server() {
        try {
            serverSocket = new ServerSocket(8000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            System.out.println("准备连接，");
            Socket socket = serverSocket.accept();
            System.out.println("连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.server();
        server.start();
    }
}
