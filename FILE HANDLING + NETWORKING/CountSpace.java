// 27. Read a file and count spaces, tabs, and newlines separately

import java.io.FileReader;
public class CountSpace {
    public static void main(String[] args)throws Exception {
        FileReader readFile = new FileReader("C:\\Users\\Admin\\Documents\\discrete notes 1.txt");
        int spaces=0;
        int tabs=0;
        int newLines=0;
        int ch=0;
        while ( (ch = readFile.read()) !=-1) { 
            if((char)ch == ' ') spaces++;
            else if((char)ch == '\t') tabs++;
            else if((char)ch == '\n') newLines++;
        }
        System.out.println(spaces);
        System.out.println(tabs);
        System.out.println(newLines);
        readFile.close();
    }
}
