package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable{

	

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton Button;

    @FXML
    private JFXButton login;

    @FXML
    private JFXCheckBox remember;

    @FXML
    private JFXButton forgotpassword;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		username.setStyle("-fx-text-inner-color: #a0a2ab;");
		password.setStyle("-fx-text-inner-color: #a0a2ab;");
		
	}
	
	public void signUp(ActionEvent e1) throws IOException 
	{
		login.getScene().getWindow().hide();
		
		Stage signup = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/SignUp.fxml"));
		Scene scene = new Scene(root);
		signup.setScene(scene);
		signup.show();
		signup.setResizable(false);
	}

}
