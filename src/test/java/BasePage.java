import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shyshkin_vlad on 11.07.16.
 */
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void clickBtn(final By locator)
    {
        WebElement button = driver.findElement(locator);
        button.click();
    }

    protected void typeText(final By locator, final String text)
    {
        WebElement input = driver.findElement(locator);
        input.clear();
        input.sendKeys(text);
    }

    protected void acceptAlert(){
        try{
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
