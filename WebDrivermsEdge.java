package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDrivermsEdge {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\IdeaProjects\\Software\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com");

        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(3000);
        driver.getCurrentUrl();

        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("pinal.patel@yahoo.com");

        driver.findElement(By.id("Password")).sendKeys("Niyam5");

       Thread.sleep(3000);
       driver.findElement(By.className("login-button")).click();

    }
}
