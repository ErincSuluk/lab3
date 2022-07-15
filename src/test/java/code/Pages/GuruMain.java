package code.Pages;

import code.Utilities.BrowserUtils;
import code.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruMain extends BrowserUtils {
    public GuruMain(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='addcustomer.php'])[1]")
    public WebElement addCustomerButton;

    public void setAddCustomerButton() {
        addCustomerButton.click();
    }
}
