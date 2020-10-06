package com.fourall.tasks;

import com.fourall.appobjects.HomeAppObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class HomeTask {
	private HomeAppObject homeAppObject;
  private WebDriver driver;
  public static final String Home_URL ="https://shopcart-challenge.4all.com/";  

  public HomeTask(WebDriver driver) {
    this.homeAppObject = new HomeAppObject(driver);
  }
  public void navigateToHomePage(WebDriver driver) { 
    this.driver.get(Home_URL); 
    this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }  
  public void selectListProduct(){
    this.homeAppObject.getSelectList().click();
    this.homeAppObject.getSelectListSweets().click();
  }
  public void backHome(){
    this.homeAppObject.getSelectList().click();
    this.homeAppObject.getSelectListAll().click();
  }
  public void shoppingCart(){
    this.homeAppObject.getSelectCart().click();
  }
  public void getOut(){
    this.driver.quit();
  }

  public void getSweets(){
    this.homeAppObject.getSelectList().click();
    this.homeAppObject.getSelectListSweets().click();
    for(WebElement sweet : this.homeAppObject.getSweets()){
       sweet.click();
    }
       
  }
   
}
