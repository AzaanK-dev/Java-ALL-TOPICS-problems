// 19. Implement TCP client-server message exchange (text-based chat).

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;
public class Server{
    public static void main(String[] args)throws Exception{
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("Waiting...");
        Socket s = ss.accept();
        System.out.println("Client Connected!");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        Scanner serverMsg = new Scanner(System.in);

        Thread read = new Thread(()->{
            try{
                while (true) {
                    String msg = in.readUTF();
                    System.out.println("Client says: "+msg);
                    if(msg.equals("bye")) break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        });
        Thread write = new Thread(()->{
            try{
                while (true) {
                    String msg = serverMsg.nextLine();
                    System.out.println("Say Server: ");
                    out.writeUTF(msg);
                    out.flush();
                    if(msg.equals("bye")) break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        });

        read.start();
        write.start();
        read.join();
        write.join();
        ss.close();
        serverMsg.close();
        System.out.println("Server Closed!");
    }
}
