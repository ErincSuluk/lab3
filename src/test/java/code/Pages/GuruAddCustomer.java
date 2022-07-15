package code.Pages;

import code.Utilities.BrowserUtils;
import code.Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GuruAddCustomer extends BrowserUtils {
    public GuruAddCustomer(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[.='Add Customer']")
    public WebElement textOfAddCustomer;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> backgroundCheck;

    @FindBy(id = "fname")
    private WebElement FirstName;

    @FindBy(id = "lname")
    private WebElement LastName;

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(xpath = "//div[@class='12u$']//textarea")
    private WebElement Address;

    @FindBy(id = "telephoneno")
    private WebElement PhoneNumber;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;

    public void setTextOfAddCustomer(String TextOfAddCustomer) {

        Assert.assertEquals(textOfAddCustomer.getText(),TextOfAddCustomer);
    }

    public void setBackgroundCheck(String backGroundCheck) {
        for (WebElement each:backgroundCheck) {
            if (each.getAttribute("id").equals(backGroundCheck)){
                each.click();
            }

        }
    }

    public void setFirstName(String firstName) {

        FirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {

        LastName.sendKeys(lastName);
    }

    public void setEmail(String email) {

        Email.sendKeys(email);
    }

    public void setAddress(String address) {

        Address.sendKeys(address);
    }

    public void setPhoneNumber(String phoneNumber) {

        PhoneNumber.sendKeys(phoneNumber);
    }

    public void setSubmitButton() {
        submitButton.click();
    }
}
