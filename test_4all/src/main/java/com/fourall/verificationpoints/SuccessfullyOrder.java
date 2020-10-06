package com.fourall.verificationpoints;

import com.fourall.appobjects.SuccessfullyObject;
import com.fourall.framework.Reports;
import com.fourall.framework.ScreenShot;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.relevantcodes.extentreports.LogStatus;

public class SuccessfullyOrder {
  private SuccessfullyObject successfullyObject;

  public SuccessfullyOrder(WebDriver driver) {
    this.successfullyObject = new SuccessfullyObject(driver);
  }

  public void checkOrderSuccess(WebDriver driver) {
    WebElement orderSuccess;
    orderSuccess = this.successfullyObject.getResulte();
    String value = orderSuccess.getText();

    Reports.create("Pedido", "Pedido com Sucesso");

    System.out.println(value);
        Reports.startTest("Pedido com Sucesso");
    if (value != null) {
      if (value.equals("Pedido realizado com sucesso!")) {
        Reports.log(LogStatus.PASS, "Produto Correto", ScreenShot.capture(driver));
        System.out.println("Passou Teste");
      } else {
        Reports.log(LogStatus.FAIL, "Produto Errado", ScreenShot.capture(driver));
        System.out.println("Error!");
        Assert.fail();
      }

    }
  }

}

  
