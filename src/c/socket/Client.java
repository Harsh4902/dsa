package c.socket;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        try{
            Socket s = new Socket("localhost",8080);
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            String message = sc.next();
            output.writeUTF(message);
            output.flush();
            output.close();
            s.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
