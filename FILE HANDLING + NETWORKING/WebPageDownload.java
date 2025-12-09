// Download a page in html file from a website and then open it from your device.

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class WebPageDownload {
    public static void main(String[] args)throws Exception{
        URL url = new URI("https://www.coursera.org/").toURL() ;   // website link of coursera

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        FileWriter writer = new FileWriter("webpage.html");
        String line;
        while ((line = in.readLine())!=null) {
            writer.write(line+"\n");
        }
        File htmlFile = new File("webpage.html");
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().browse(htmlFile.toURI());
            System.out.println("Opened successfully!");
        }else{
            System.out.println("Desktop isn't supported!");
        }
        writer.close();
    }
}
