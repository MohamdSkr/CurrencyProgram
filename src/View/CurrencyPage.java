package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CurrencyPage extends Stage{
    private FXMLLoader loader;
    private Parent parent;
    private Scene scene;
    
    public CurrencyPage() throws IOException{
        
        loader = new FXMLLoader(getClass().getResource("FXML/CurrencyPageFXML.fxml"));
        parent = loader.load();     
        scene = new Scene(parent);
        setScene(scene);
        setTitle("Currency Converter");
        show();
        
    }   
}
