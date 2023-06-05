package mainscenes;
import java.io.IOException;

public class CameraApp {
    public static void StartCam() {
        try {
            // Specify the path to your executable file
            String executableFilePath = "C:\\Users\\bish_\\OneDrive\\Desktop\\Hackathon\\cam.exe";

            // Create a ProcessBuilder instance
            ProcessBuilder processBuilder = new ProcessBuilder(executableFilePath);

            // Start the process
            Process process = processBuilder.start();

            // Optionally, you can wait for the process to complete
            int exitCode = process.waitFor();
            

            // Print the exit code
//            System.out.println("Executable exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

