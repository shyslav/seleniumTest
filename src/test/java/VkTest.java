import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by shyshkin_vlad on 11.07.16.
 */
public class VkTest {
    private String password = "test";
    private WebDriver driver;

    @Before
    public void before()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void after()
    {
        driver.close();
    }

    @Test
    public void vkTest()
    {
        VkLoginPage vk = new VkLoginPage(driver);
        //vk.open("http://vk.com");
        //vk.enterMail("+380935825956");
        //vk.enterPassword(password);
        //vk.clickButton();

        vk.open("http://vk.com").enterMail("+380935825956").enterPassword("password").clickButton();

        Assert.assertTrue(driver.getCurrentUrl().equals("http://vk.com/"));
    }

}
