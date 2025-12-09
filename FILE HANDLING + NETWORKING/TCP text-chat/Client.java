// TCP CLIENT
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client{
    public static void main(String[] args)throws Exception{
        Socket s = new Socket("localhost",9090);
        System.out.println("Connected to Server!");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        Scanner clientMsg = new Scanner(System.in);

        Thread read = new Thread(()->{
            try{
                while (true) {
                    String msg = in.readUTF();
                    System.out.println("Server says: "+msg);
                    if(msg.equals("bye")) break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        });
        Thread write = new Thread(()->{
            try{
                while (true) {
                    String msg = clientMsg.nextLine();
                    System.out.println("Say Client");
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
        s.close();
        clientMsg.close();
        System.out.println("Client Closed!");
    }
}
