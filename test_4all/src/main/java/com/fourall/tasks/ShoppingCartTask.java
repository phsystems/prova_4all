package com.fourall.tasks;
import com.fourall.appobjects.ShoppingCartObject;
import org.openqa.selenium.WebDriver;

public class ShoppingCartTask{
    private ShoppingCartObject ShoppingCartObject;

    public ShoppingCartTask(WebDriver driver) {  
		this.ShoppingCartObject = new ShoppingCartObject(driver);
  }
  public void AddItemsSweets(){
      for (int i = 0; i < 3; i++){
         this.ShoppingCartObject.getbuttonAddSweets().click();
      }
  }
  public void AddItemsSnacks(){
    for (int i = 0; i < 8; i++){
       this.ShoppingCartObject.getbuttonAddSnacks().click();
    }
}
  public void RemoveItemsSnacks(){
    for (int i = 0; i < 4; i++){
       this.ShoppingCartObject.getbuttonRemoveSnacks().click();
    }
  }
  public void checkOut(){
    this.ShoppingCartObject.getbuttonCheckout().click();
  }
  public void close(){
    this.ShoppingCartObject.getbuttonCLose().click();
  }
 
}