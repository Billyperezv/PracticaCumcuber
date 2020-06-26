package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.cert.Extension;
import java.util.List;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }



    public void click (By elment) throws Exception{

        try {

            driver.findElement(elment).click();

        }catch (Exception e){
            throw new Exception ("No se puede clikear el elemento : "+elment);

        }

    }

    public boolean isDispleyed (By elment ) throws Exception {
        try {
            return this.isDispleyed(elment);

        }catch (Exception e){

            throw new Exception("El elento no esta visible en el DOM"+ elment.toString());
        }

    }

    public  WebElement findElemt (By locator){
        return driver.findElement(locator);

    }

    public List<WebElement> findElements(By locator){

        return  driver.findElements(locator);

    }

    public String getText(WebElement element){
        return element.getText();


    }

    public String getText(By element){
        return driver.findElement(element).getText();


    }


    public Select dropDown (WebElement element){

        return dropDown(element);
    }

    public  void  teclear (String inputText,By locator ){
        driver.findElement(locator).sendKeys(inputText);


    }


}
