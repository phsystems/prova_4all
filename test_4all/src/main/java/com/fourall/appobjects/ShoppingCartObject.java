package com.fourall.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartObject{
  private WebDriver driver;

  public ShoppingCartObject(WebDriver driver){
        this.driver = driver; 
    } 
    public WebElement getbuttonAddItems(){
      WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By
        .xpath("//div[@id='add-product-4-qtd']/span[text()='+']")));
    }
    public WebElement getbuttonCheckout(){
      WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
          .visibilityOfElementLocated(By.id("finish-checkout-button")));
    }
    
    public WebElement getbuttonCLose(){
      WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By
          .xpath("//button[@class='close-modal sc-jqCOkK ippulb']")));
    }  
  
}
