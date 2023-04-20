package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginPage extends Stage{
    
    private FXMLLoader loader;
    private Parent parent;
    private Scene scene;
    
    public LoginPage() throws IOException{
        
        loader = new FXMLLoader(getClass().getResource("FXML/LoginPageFXML.fxml"));
        parent = loader.load();     
        scene = new Scene(parent);
        setScene(scene);
        setTitle("Login");
        show();
        
    }   
    
}
