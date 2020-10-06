package com.fourall;

import com.fourall.tasks.HomeTask;
import com.fourall.tasks.ShoppingCartTask;
import com.relevantcodes.extentreports.LogStatus;
import com.fourall.framework.Reports;
import com.fourall.framework.ScreenShot;
import com.fourall.verificationpoints.SuccessfullyOrder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class Challenge{
    private HomeTask homeTask;
    private ShoppingCartTask ShoppingCartTask;
    private WebDriver driver;  
    private SuccessfullyOrder successfullyOrder;
    public static final String Home_URL ="https://shopcart-challenge.4all.com/"; 
    
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        this.driver      = new ChromeDriver(); 
        this.driver.get(Home_URL); 
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           this.homeTask         = new HomeTask(driver); 
        this.ShoppingCartTask = new ShoppingCartTask(driver);   
        this.successfullyOrder= new SuccessfullyOrder(driver);
    }
    @Test
    public void buyProductOne(){    
              
        this.homeTask.getSweets();
        Reports.log(LogStatus.INFO, "Seleciona Produtos", ScreenShot.capture(driver));
        this.homeTask.backHome();
        Reports.log(LogStatus.INFO, "Pagina Inicial", ScreenShot.capture(driver));
        this.homeTask.shoppingCart();  
        Reports.log(LogStatus.INFO, "Carrinho com produtos", ScreenShot.capture(driver));  
        
        this.ShoppingCartTask.AddItemsSweets();
        Reports.log(LogStatus.INFO, "Altera quantidade", ScreenShot.capture(driver)); 
        this.ShoppingCartTask.checkOut();
        this.successfullyOrder.checkOrderSuccess();
        this.ShoppingCartTask.close();        
    }
    @AfterTest
	public void getOut(){
        this.driver.quit();
    }
   
}
