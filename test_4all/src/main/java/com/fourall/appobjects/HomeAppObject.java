package com.fourall.appobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeAppObject{
    private WebDriver driver;

    public HomeAppObject(WebDriver driver){
        this.driver = driver; 
    } 
    public WebElement getSelectList(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("open-categories-btn")));
    }
    public WebElement getSelectListAll(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("category-all")));
    }
    public WebElement getSelectListDrinks(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("category-0")));
    }
    public WebElement getSelectListSweets(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("category-1")));
    }
    public WebElement getSelectListSnacks(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("category-2")));
    }
    public WebElement getSelectSnacks(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("add-product-3-btn")));
    }
    public WebElement getSelectCart(){
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
        return wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("cart-btn")));
    }
    public List<WebElement> getAllProducts() {
        final List<WebElement> allProducts = 
                this.driver.findElements(By.xpath("//ul/li/*/button"));
        return allProducts ;
    }
            

}   


