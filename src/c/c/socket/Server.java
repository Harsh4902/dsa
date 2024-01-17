package c.c.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try{
            ServerSocket server = new ServerSocket(8080);
            while (true) {
                Socket s = server.accept();
                DataInputStream input = new DataInputStream(s.getInputStream());
                String str = (String) input.readUTF();
                System.out.println("Message from Client: " + str);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
