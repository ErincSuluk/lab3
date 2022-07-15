package code.StepDefinitions;

import code.Pages.GuruAddCustomer;
import code.Pages.GuruMain;
import code.Utilities.BrowserUtils;
import code.Utilities.ConfigurationsReader;
import code.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps extends BrowserUtils {

    GuruMain guruMain=new GuruMain();
    GuruAddCustomer guruAddCustomer=new GuruAddCustomer();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("url"));
    }

    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
         guruMain.setAddCustomerButton();
    }

    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String string) {
        guruAddCustomer.setTextOfAddCustomer(string);

    }

    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String string) {
        guruAddCustomer.setBackgroundCheck(string);


    }

    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String string, String string2, String string3, String string4, String string5) {
        guruAddCustomer.setFirstName(string);
        guruAddCustomer.setLastName(string2);
        guruAddCustomer.setEmail(string3);
        guruAddCustomer.setAddress(string4);
        guruAddCustomer.setPhoneNumber(string5);

    }

    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {

    }
}
