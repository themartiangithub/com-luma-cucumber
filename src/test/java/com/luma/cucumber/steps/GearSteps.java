package com.luma.cucumber.steps;

import com.luma.pages.DufflePage;
import com.luma.pages.HomePage;
import com.luma.pages.MenPantsPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GearSteps extends Utility {

    @Given("I am on home page")
    public void iAmOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
    }

    @When("I mouse hover on gear menu")
    public void iMouseHoverOnGearMenu() {
    }

    @And("I click on bags")
    public void iClickOnBags() {
    }

    @And("I click on product name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() throws InterruptedException {
        new HomePage().mouseHoverOnGearAndClick();
    }

    @And("I change the quantity {string}")
    public void iChangeTheQuantity(String qty) {
        new DufflePage().changeQuantity(qty);
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() {
        new DufflePage().clickOnAddToCart();
    }

    @Then("I verify the text of the product {string}")
    public void iVerifyTheTextOfTheProduct(String text) {
        verifyTwoStrings(text, By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    }

    @And("I click on shopping cart link into messae")
    public void iClickOnShoppingCartLinkIntoMessae() throws InterruptedException {
        new MenPantsPage().clickOnShoppingCart();
    }

    @Then("I verify the produt name {string}")
    public void iVerifyTheProdutName(String text) {
        verifyTwoStrings(text, By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']"));
    }

    @Then("I verify the quantity {string}")
    public void iVerifyTheQuantity(String text) {
        String actual = driver.findElement(By.xpath("//input[@title='Qty']")).getAttribute("value");
        Assert.assertEquals(text, actual);
    }

    @Then("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String text) {
        verifyTwoStrings(text, By.xpath("(//span[@class='cart-price']//span)[2]"));
    }

    @And("I Change quantity to {string}")
    public void iChangeQuantityTo(String text) {
        new ShoppingCartPage().changeQuantity(text);
    }

    @And("I click on update shopping cart button")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdate();
    }

    @Then("I Verify the price of the product {string}")
    public void iVerifyThePriceOfTheProduct(String text) throws InterruptedException {
        Thread.sleep(1000);
        verifyTwoStrings(text,By.xpath("(//span[@class='cart-price']//span)[2]"));
    }
}
