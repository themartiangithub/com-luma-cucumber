package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DufflePage extends Utility {
    private static final Logger log = LogManager.getLogger(DufflePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity;
    //By quantity = By.xpath("//input[@id='qty']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    //By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    public void changeQuantity(String text) {
        log.info("Change Quantity "+text);
        quantity.clear();
        sendTextToElement(quantity, text);
        //CustomListeners.test.log(Status.PASS, "Change Quantity "+text);
    }

    public void clickOnAddToCart() {
        log.info("Click on Add to Cart ");
        clickOnElement(addToCart);
        //CustomListeners.test.log(Status.PASS, "Click on Add to Cart ");
    }
}
