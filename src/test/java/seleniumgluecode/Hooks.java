package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;


    @Before
    public void setUP (){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/login_sucess.php");

    }

    @After
    public void closeBrawser (){
        driver.quit();


    }

    public static ChromeDriver getDriver(){

        return (ChromeDriver) driver;
    }

}
