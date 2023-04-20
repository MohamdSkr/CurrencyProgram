package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrencyPageFXMLController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private Button logoutBtn;
    @FXML
    private Label usLabel;
    @FXML
    private Label nisLabel;
    @FXML
    private TextField usField;
    @FXML
    private TextField nisField;
    @FXML
    private Button convertBtn;
    @FXML
    private Button resetBtn1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {}    

    @FXML
    private void logoutBtnHandel(ActionEvent event) throws IOException {
        ViewManager.closeCurrencyPage();
        ViewManager.openLoginPage();
    }

    @FXML
    private void convertBtnHandel(ActionEvent event) {
        
        if(usField.getText().isEmpty())
        {
            double nis = Double.parseDouble(nisField.getText());
            double us = nis / 3.66;
            usField.setText(String.valueOf(us));   
        }
        else{
            double us = Double.parseDouble(usField.getText());
            double nis = us * 3.66;
            nisField.setText(String.valueOf(nis));
        }
        
    }

    @FXML
    private void resetBtnHandel(ActionEvent event) {
        
        usField.setText("");
        nisField.setText("");
        
    }
    
}
