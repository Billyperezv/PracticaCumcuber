package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.cert.Extension;

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


}
