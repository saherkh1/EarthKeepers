package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class Aroma {
	
	@FXML
	Button xBtn = new Button();
	
	public void XBtn(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
	}
}
