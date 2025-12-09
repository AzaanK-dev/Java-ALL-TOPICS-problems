// Recursively calculate total folder size (all subfolders/files).

import java.io.File;
public class FolderSizeCalculate {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\Desktop\\Java Projects");
        long ans = calculateFolderSize(folder);
        System.out.println("Total Folder Size: "+ans);
    }
    public static long calculateFolderSize(File folder){
        File[] files = folder.listFiles();
        long sum=0;
        if(files!=null){
            for(File file:files){
                if(file.isFile()) sum += file.length();
                else sum += calculateFolderSize(file);
            }
        }
        return sum;
    }
}