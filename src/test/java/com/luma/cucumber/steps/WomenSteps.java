package com.luma.cucumber.steps;

import com.luma.pages.HomePage;
import com.luma.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenSteps extends Utility {
    @When("I mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
    }

    @And("I mouse Hover on Tops")
    public void iMouseHoverOnTops() {
    }

    @And("I click on Jackets")
    public void iClickOnJackets() throws InterruptedException {
        Thread.sleep(3000);
        new HomePage().mouseHoverOnWomenTopsAndClick();
        Thread.sleep(3000);
    }

    @Then("I verify the products name display in alphabetical order")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() throws InterruptedException {
        // Storing jackets names in list
        List<WebElement> jacketsElementsList = webElementList(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Select Sort By filter “Product Name”
        new HomePage().selectSortingOption("Product Name");
        // After Sorting value
        jacketsElementsList = webElementList(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);
    }

    @Then("I verify the products price display in low to high")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() throws InterruptedException {

        List<WebElement> jacketsPriceElementList = webElementList(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Select Sort By filter “Price”
        new HomePage().selectSortingOption("Price");
        // After Sorting Products by Price
        jacketsPriceElementList = webElementList(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }
}
