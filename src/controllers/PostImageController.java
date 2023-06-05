package controllers;

import mainscenes.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class PostImageController extends Application implements Initializable {
	@FXML
	Button btn;
	@FXML
	private ImageView image;
	
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("./postImage.fxml"));
		Scene scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("../misc/everything.css").toExternalForm());
		primaryStage.setTitle("Post Image");
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
		
	}
	
	public void Post(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource("./afterPosting.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setTitle("After Post");
		primaryStage.setScene(scene);	
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();	
	}
	
	public void Report(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource("./afterReporting.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setTitle("After Report");
		primaryStage.setScene(scene);	
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();	
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		CameraApp.StartCam();
		try {
            // Pause the execution for 3 seconds
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		Image img = ImageLoader.GetImage();
		image.setImage(img);
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
