package View;

import java.io.IOException;

public class ViewManager {
    
    private static LoginPage loginPage = null;
    private static CurrencyPage currencyPage = null;
    
    public ViewManager() throws IOException{
        openLoginPage();
    }
    
    public static void openLoginPage() throws IOException{
        
        if(loginPage == null)
            loginPage = new LoginPage();
        
        loginPage.show();
    
    }
    
    public static void closeLoginPage(){
        
        if(loginPage != null)
            loginPage.close();
    
    }
    
    public static void openCurrencyPage() throws IOException{
        
        if(currencyPage == null)
            currencyPage = new CurrencyPage();
        
        currencyPage.show();
        
    }
    
    public static void closeCurrencyPage(){
        
        if(currencyPage != null)
            currencyPage.close();
        
    }
    
}
