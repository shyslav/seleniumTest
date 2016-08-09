import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by shyshkin_vlad on 11.07.16.
 */
public class VkLoginPage extends BasePage {
    private static By emailInput = By.xpath("//input[@id='quick_email']");
    private static By passwordInput = By.xpath("//input[@id='quick_pass']");
    private static By loginButton = By.xpath("//button[@id='quick_login_button']");

    public VkLoginPage open(String url)
    {
        driver.get(url);
        return this;
    }

    public VkLoginPage(WebDriver driver) {
        super(driver);
    }

    public VkLoginPage enterMail(String text)
    {
        typeText(emailInput,text);
        return this;
    }

    public VkLoginPage enterPassword(String text)
    {
        typeText(passwordInput,text);
        return this;

    }

    public VkLoginPage clickButton()
    {
        clickBtn(loginButton);
        return this;

    }
}
