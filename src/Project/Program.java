package Project;

import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Program extends Application{
    
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        ViewManager.openLoginPage();
        
    }
    
    
    
}
