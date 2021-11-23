package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverInternetExplorer {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\IdeaProjects\\Software\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();


        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
}
