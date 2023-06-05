package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AfterRegistrationController implements Initializable {
	    @FXML
	    Label details;
	    @FXML 
		public Button Done = new Button();

	    @FXML
	    private void viewEventDetails() {
	        // Add your logic for viewing event details
	    }
	    public void start(Stage primaryStage) throws Exception {	
	    	Parent root = FXMLLoader.load(getClass().getResource("AfterEventCreatingForm.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();			
		}
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			String text="event Name: "+EventRegistrationController.eventName+"\n";
			text+="event Location: "+EventRegistrationController.eventLocation+"\n";
			text+="event Description: \n"+EventRegistrationController.eventDescription+"\n";
			text+="event Date: "+EventRegistrationController.eventDate+"\n";
			details.setText(text);		
		}
		
		public void doneBtn(ActionEvent event) throws Exception {
			((Node) event.getSource()).getScene().getWindow().hide();
			HomePage aFrame = new HomePage();
			aFrame.start(new Stage());
		}
		
		public void eventBtn(ActionEvent event) throws Exception {
			((Node) event.getSource()).getScene().getWindow().hide();
			eventsController aFrame = new eventsController();
			aFrame.start(new Stage());

		}	
		
		
		public void Camera(ActionEvent event) throws IOException {
			((Node)event.getSource()).getScene().getWindow().hide();
			Parent root = FXMLLoader.load(getClass().getResource("./postImage.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Home Page");
			primaryStage.setScene(scene);		
			primaryStage.show();	
		}
}
