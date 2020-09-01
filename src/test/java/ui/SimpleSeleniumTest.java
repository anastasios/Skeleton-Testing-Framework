package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSeleniumTest {
    WebDriver webDriver;

    @Test
    public void simpleSeleniumTest() {

        WebDriverManager.chromedriver().driverVersion("84.0").setup(); //include here your local chrome version if it's not 84
        webDriver = new ChromeDriver();

        webDriver.get("http://www.google.co.uk");

        //more assertions needed here

        webDriver.quit();
    }
}
