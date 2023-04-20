package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class LoginPageFXMLController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label passwordLabel;
    @FXML
    private TextField userField;
    @FXML
    private Label userLabel;
    @FXML
    private Button loginBtn;
    @FXML
    private ImageView loginImg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {}    

    @FXML
    private void loginBtnHandel(ActionEvent event) throws IOException {
        
        String username = "admin";
        String password = "123";
        Alert alert;
        
        if(userField.getText().equalsIgnoreCase(username) && passwordField.getText().equalsIgnoreCase(password)){
            ViewManager.openCurrencyPage();
            ViewManager.closeLoginPage();
            
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Operation successful");
            alert.setContentText("The operation completed successfully.");
            alert.show();
            
            
        }else{
            
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid input");
            alert.setContentText("Please enter a valid input.");
            alert.show();


        }
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), ev -> {
                alert.hide();
            }));
            timeline.play();
        
    }
    
}
