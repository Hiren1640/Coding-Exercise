import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
    //Classes Objects
    ResultVerificationPage resultVerificationPage = new ResultVerificationPage();
    LoginPage loginPage =new LoginPage();

    //    Login Test Cases
    @Given("^User click on Login Option$")
    public void user_click_on_Login_Option()  {
        resultVerificationPage.verificationOfApplicationURL();
    }

    @When("^User is on login page and Verify the Login page Title$")
    public void user_is_on_login_page_and_Verify_the_Login_page_Title()  {
        loginPage.clickOnLoginLink();
        resultVerificationPage.verificationOfLoginPageTitle();
    }

    @Then("^User Enter Username and Password and Click on Login$")
    public void user_Enter_Username_and_Password_and_Click_on_Login()  {
        loginPage.doLogin();
    }

    @Then("^User is on Homepage$")
    public void user_is_on_Homepage() {
        resultVerificationPage.verificationOfHomePageTitle();
    }

//    Register Test Cases


}
