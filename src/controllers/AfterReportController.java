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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mainscenes.DeleteFilesInFolder;

public class AfterReportController implements Initializable{
	
	@FXML 
	public Text quote = new Text();
	@FXML 
	public ImageView police;
	@FXML 
	public Button btnDone = new Button();

	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("./afterReporting.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
	}
	
	public void Home(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource("./homePage.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Page");
		primaryStage.setScene(scene);	
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();	
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DeleteFilesInFolder.delete();
		Image img = new Image("/misc/police.png");
		police.setImage(img);
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
