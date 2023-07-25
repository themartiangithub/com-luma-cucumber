package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement quantity;
    //By quantity = By.xpath("(//input[@class='input-text qty'])[1]");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement update;
    //By update = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void changeQuantity(String text) {
        log.info("Change Quantity "+text);
        quantity.clear();
        sendTextToElement(quantity, text);
        //CustomListeners.test.log(Status.PASS,"Change Quantity "+text);
    }

    public void clickOnUpdate() {
        log.info("Click on Update");
        clickOnElement(update);
        //CustomListeners.test.log(Status.PASS,"Click on Update");
    }
}
