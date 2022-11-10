import org.openqa.selenium.By;

public class LoginPage extends Utils {
    //    Calling LoadProperty class for config property access
    LoadProperty loadProperty = new LoadProperty();

    //    Storing Locators inside the variables.
    private By _loginLink = By.className("ico-login");
    private By _UserName = By.id("Email");
    private By _PassWord = By.id("Password");
    private By _LoginBtn = By.className("login-button");

//     Create the Methods

    public void clickOnLoginLink(){
        //        Clicking on Login Link
        clickOnElement(_loginLink);
    }
    public void doLogin(){
//        Enter UserName and Password
        enterText(_UserName,loadProperty.getProperty("UserName"));
        enterText(_PassWord,loadProperty.getProperty("PassWord"));
//        Click on Login Button
        clickOnElement(_LoginBtn);

    }




}

