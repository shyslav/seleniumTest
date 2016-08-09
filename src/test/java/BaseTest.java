import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by shyshkin_vlad on 11.07.16.
 */
public class BaseTest {

    public static final String url = "https://www.google.com/";
    public static By inputLocator = By.xpath("//input[@id='lst-ib']");
    public static By searchButton = By.xpath("//button[@name ='btnG']");
    public static String request = "Кошак";
    public static By resultUrls = By.xpath("//cite");
    public static String expected = "https://www.youtube.com/watch?v=jtcF_LjI_7A";

    public static boolean firstFifth()
    {
        boolean done = false;

        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //test running
        driver.get(url);
        //input to google.com
        WebElement input = driver.findElement(inputLocator);
        input.clear();
        input.sendKeys(request);

        //click btn
        WebElement btnSearch = driver.findElement(searchButton);
        btnSearch.click();

        //search link
        List<WebElement> resultList = driver.findElements(resultUrls);
        List<String> urlList = new ArrayList();
        for (WebElement e: resultList)
        {
            urlList.add(e.getText());
        }
        if(urlList.contains(expected)){
            System.out.println("Good Work");
            done=true;
        }else {
            System.out.println("Bad");
        }

        //close driver
        try {
            Thread.sleep(2000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return done;
    }
}
