import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'loginByLogin')]")
    private WebElement LoginField;

    @FindBy(xpath = "//*[contains(@id, 'password')]")
    private WebElement PasswordField;

    @FindBy(xpath = "//*[contains(@id, '')]")
    private WebElement ButtonField;

    public void LoginInput(String Login){
        LoginField.sendKeys(Login);
    }
    public void PasswordInput(String Password){
        PasswordField.sendKeys(Password);
    }

}
