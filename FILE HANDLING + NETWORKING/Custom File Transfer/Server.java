// Implement custom file transfer logic (client sends file → server saves).
// SERVER

import java.io.*;
import java.net.*;
public class Server{
    public static void main(String[] args)throws Exception{
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("waiting...");
        Socket s = ss.accept();
        System.out.println("connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        File newFile = new File("newFile.txt");
        newFile.createNewFile();
        System.out.println("File created");

        FileWriter writer = new FileWriter("newFile.txt"); 

        String msg = in.readLine();
        while (!msg.equalsIgnoreCase("end")) {
            msg = in.readLine();
            writer.write(msg);
        }
        System.out.println("File copied from client and written!");

        ss.close();
        s.close();
        writer.close();
    }
}
