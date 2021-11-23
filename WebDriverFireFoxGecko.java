package SeleniumSession1;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFireFoxGecko {
    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\Software\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
}
