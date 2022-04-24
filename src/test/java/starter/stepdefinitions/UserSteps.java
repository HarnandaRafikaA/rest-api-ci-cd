package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.Get;

public class UserSteps {
    @Steps
    Get get;
    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoint();
    }
    @When("I sen GET HTTP request")
    public void sendGetHTTPRequest(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHTTPResponse(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        get.validateDataDetailUser();
    }
}
