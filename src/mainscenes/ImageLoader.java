package mainscenes;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class ImageLoader {
    public static Image GetImage() {
        try {
            // Specify the path to the folder containing the images
            String folderPath = "C:\\Users\\bish_\\Pictures\\Camera Roll\\";

            // Create a File object for the folder
            File folder = new File(folderPath);

            // Get a list of all files in the folder
            File[] files = folder.listFiles();

            // Iterate over each file in the folder
            for (File file : files) {
                // Check if the file is an image
                if (file.isFile() && isImageFile(file.getName())) {
                    // Load the image file
                    BufferedImage image = ImageIO.read(file);
                    Image fxImage = SwingFXUtils.toFXImage(image, null);
//                    System.out.println(fxImage);
                    return fxImage;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    // Helper method to check if a file has an image extension
    private static boolean isImageFile(String fileName) {
        String[] imageExtensions = {".jpg", ".jpeg", ".png", ".gif"};
        for (String extension : imageExtensions) {
            if (fileName.toLowerCase().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }
}
