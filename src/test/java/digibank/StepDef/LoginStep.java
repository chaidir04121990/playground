package digibank.StepDef;
import digibank.BaseTest;
import digibank.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseTest{
    LoginPage lp = new LoginPage();

    @Given("Launch apps")
    public void launch(){
        lp.clickSKIP();
    }
    @When("print two")
    public void printdua(){
        System.out.println("print line 2");
    }
    @Then("print three")
    public void printtiga(){
        System.out.println("print line 3");
    }

}
