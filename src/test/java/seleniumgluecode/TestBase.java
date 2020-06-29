package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {

    protected WebDriver driver= Hooks.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected PageContact pageContact =new PageContact(driver);
    protected PageFlights pageFlights = new PageFlights(driver);
    protected PageHotels pageHotels = new PageHotels(driver);
    protected PageRegister pageRegister = new PageRegister(driver);
    protected PageSignOn pageSignOn = new PageSignOn(driver);
    protected PageSupport pageSupport = new PageSupport(driver);



}
