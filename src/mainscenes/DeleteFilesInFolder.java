package mainscenes;
import java.io.File;

public class DeleteFilesInFolder {
    public static void delete() {
        String folderPath = "C:\\Users\\bish_\\Pictures\\Camera Roll"; // Specify the path to your folder

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }

//        System.out.println("All files in the folder have been deleted.");
    }
}