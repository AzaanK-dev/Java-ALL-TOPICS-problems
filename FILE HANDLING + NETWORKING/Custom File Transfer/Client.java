// CLIENT 
import java.io.*;
import java.net.*;
import java.util.*;
public class Client{
    public static void main(String[] args)throws Exception{
        Socket s = new Socket("localhost",9090);
        System.out.println("connected");

        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        System.out.println("Enter file path");
        Scanner sc = new Scanner(System.in);

        File file = new File(sc.nextLine());
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            out.println(read.nextLine());
        }
        out.println("end");

        s.close();
        sc.close();
        read.close();
    }
}
