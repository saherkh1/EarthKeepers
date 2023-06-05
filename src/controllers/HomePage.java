package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomePage {
	
	@FXML 
	public Button events = new Button();
	
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/controllers/homePage.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
		adv(new Stage());
	}
	
	public void adv(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/controllers/aroma.fxml"));
		Scene scene = new Scene(root);
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
}
