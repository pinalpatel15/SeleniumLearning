package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {

    public static void main(String[] args) throws InterruptedException{

        //2. Setup chromedriver (mediator) - It's path.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\Software\\chromedriver.exe");

        //1. Create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //Topcasting - child class object referred by parent interface reference variables.

        //3.Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep( 3000);  //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

        //4. Get page title (Tab name)
        String title = driver.getTitle();
        System.out.println(title);

        //5. Excepeted vs Actual - Validation

        if(title.equals("nopCommerce demo store")) {
            System.out.println("The title is correct");
        } else {
            System.out.println("The title is incorrect");
        }

        // closing webpage
        //driver.class(); // classes the current session
        driver.quit();



    }

}
