package mainscenes;
import controllers.*;
import javafx.stage.Stage;
import javafx.application.Application;

public class StartScene extends Application {
	public void start(Stage primaryStage) throws Exception {
		Login loginFrame = new Login(); 
		loginFrame.start(primaryStage);
	}
	
	public static void main( String args[] ) throws Exception { 
		launch(args);  
    }
}
