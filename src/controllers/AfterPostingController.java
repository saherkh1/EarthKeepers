package controllers;

import mainscenes.DeleteFilesInFolder;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AfterPostingController implements Initializable {
	@FXML 
	public Text msg = new Text();
	@FXML 
	public Button home;
	@FXML 
	public Text points = new Text();
	@FXML 
	public Text plus = new Text();
	@FXML 
	public Text quote = new Text();
	@FXML 
	public ImageView correct = new ImageView();
	
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("./afterPosting.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
	}
	
	public void Home(ActionEvent event) throws Exception {
		((Node) event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource("./HomePage.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setTitle("After Post");
		primaryStage.setScene(scene);	
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DeleteFilesInFolder.delete();
		Image img = new Image("/misc/correct.png");
		correct.setImage(img);
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
