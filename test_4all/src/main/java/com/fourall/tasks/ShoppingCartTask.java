package com.fourall.tasks;
import com.fourall.appobjects.ShoppingCartObject;
import org.openqa.selenium.WebDriver;

public class ShoppingCartTask{
    private ShoppingCartObject ShoppingCartObject;

    public ShoppingCartTask(WebDriver driver) {  
		this.ShoppingCartObject = new ShoppingCartObject(driver);
  }
  public void AddItemsProduct(){
      for (int i = 0; i < 3; i++){
         this.ShoppingCartObject.getbuttonAddItems().click();
      }
  }
  public void checkOut(){
    this.ShoppingCartObject.getbuttonCheckout().click();
  }
  public void close(){
    this.ShoppingCartObject.getbuttonCLose().click();
  }
 
}