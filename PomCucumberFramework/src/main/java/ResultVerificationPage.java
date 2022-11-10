import org.testng.Assert;

public class ResultVerificationPage extends Utils {
    public void verificationOfApplicationURL(){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://demo.nopcommerce.com/","Current Url not matching");
    }
    public void verificationOfLoginPageTitle(){
        String LoginPageActTitle = driver.getTitle();
        String LoginPageExpTitle = "nopCommerce demo store. Login";
        Assert.assertEquals(LoginPageActTitle,LoginPageExpTitle,"Login Page title not matching");
    }
    public void verificationOfHomePageTitle(){
        String HomePageActTitle = driver.getTitle();
        Assert.assertEquals(HomePageActTitle,"nopCommerce demo store","Title Not matching");
    }
}

