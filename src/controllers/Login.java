package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login {
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/controllers/loginFrame.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
	}
	public void loginBtn(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/controllers/HomePage.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		((Node) event.getSource()).getScene().getWindow().hide();
		primaryStage.show();
	}
}
