package com.fourall.appobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessfullyObject{
    private WebDriver driver;
  
    public SuccessfullyObject(WebDriver driver){
        this.driver = driver; 
      }
      public WebElement getResulte() {
        return this.driver.findElement(By.xpath("//*[@class='sc-dNLxif jyncPa']"));
      }  
}



