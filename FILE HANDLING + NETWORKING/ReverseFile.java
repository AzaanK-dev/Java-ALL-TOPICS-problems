// Read a file and create another file containing lines in reverse order.

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String[] args) throws Exception {
        File myFile = new File("C:\\Users\\Admin\\Documents\\discrete notes 1.txt");
        File newFile = new File("newFile.txt");
        newFile.createNewFile();
        System.out.println("New File created!");
        FileWriter writer = new FileWriter(newFile);
        ArrayList<String> lines = new ArrayList<>();

        Scanner read = new Scanner(myFile);
        while (read.hasNextLine()) {
            String line = read.nextLine();
            lines.add(line);
        }
        for (int i = lines.size() - 1; i >= 0; i--) {
            writer.write(lines.get(i));
            writer.write("\n");
        }
        read.close();
        writer.close();
    }
}
