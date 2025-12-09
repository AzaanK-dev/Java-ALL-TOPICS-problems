// Encrypt and decrypt a text file by shifting characters (ASCII +3 / −3).

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class Encryption {
    FileReader myFile;
    File encrypted;
    FileWriter writer;

    public Encryption(String filePath, String encryptedPathName) throws Exception {
        myFile = new FileReader(filePath);
        encrypted = new File(encryptedPathName);
        encrypted.createNewFile();
        writer = new FileWriter(encryptedPathName);
        int c = 0;
        while (c != -1) {
            c = myFile.read(); // reads each character ASCII code...
            writer.write(c + 3);
        }
        writer.close();
        myFile.close();
    }
}

class Decryption {
    FileReader myFile;
    File decrypted;
    FileWriter writer;

    public Decryption(String encryptedFilePath, String decryptedPathName) throws Exception {
        myFile = new FileReader(encryptedFilePath);
        decrypted = new File(decryptedPathName);
        decrypted.createNewFile();
        writer = new FileWriter(decryptedPathName);
        int c = 0;
        while (c != -1) {
            c = myFile.read(); // reads each character ASCII code...
            writer.write((char) c - 3);
        }
        writer.close();
        myFile.close();
    }
}

public class FileEncryptDecrypt {
    public static void main(String[] args) throws Exception {
        new Encryption("C:\\Users\\Admin\\Documents\\discrete notes 1.txt",
                "encrypted.txt");
        new Decryption("encrypted.txt", "decrypted.txt");
    }
}
