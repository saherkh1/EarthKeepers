package controllers;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.application.Application;

public class EventRegistrationController implements Initializable {
	public static String eventName,eventLocation,eventDescription;
	public static LocalDate  eventDate;
	@FXML
    private TextField eventNameTextField;
	@FXML 
	public Button create = new Button();

    @FXML
    private DatePicker eventDateTextField;

    @FXML
    private TextField eventLocationTextField;
    @FXML
    private TextArea eventDescriptionTextField;
    
    @FXML
    private void createEvent(ActionEvent event) throws IOException {
        // Retrieve the input values from the text fields
        eventName = eventNameTextField.getText();
        eventDate = eventDateTextField.getValue();
        eventLocation = eventLocationTextField.getText();
        eventDescription = eventDescriptionTextField.getText();
        // Print the input values (replace with your custom logic)
//        System.out.println("Event Name: " + eventName);
//        System.out.println("Event Date: " + eventDate);
//        System.out.println("Event Location: " + eventLocation);
//        System.out.println("Event Description: " + eventDescription);
        FXMLLoader loader = new FXMLLoader();
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		AfterRegistrationController ar =new AfterRegistrationController();
		try {
			ar.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Add your custom logic for event creation

        
    }
	public void start(Stage primaryStage) throws Exception {	
    	Parent root = FXMLLoader.load(getClass().getResource("EventCreatingForm.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		  
	}
    
    public void back(ActionEvent event) throws IOException {
		((Node)event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource("eventsForm.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setTitle("Event Form");
		primaryStage.setScene(scene);	
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();	
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
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();	
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		  LocalDate eventDate = LocalDate.of(2023, 5, 12);
	        eventDateTextField.setValue(eventDate);		
	}
    
}