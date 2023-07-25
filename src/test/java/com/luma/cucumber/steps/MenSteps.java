package com.luma.cucumber.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPantsPage;
import com.luma.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MenSteps extends Utility {
    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() {
    }

    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
    }

    @And("I click on Pants")
    public void iClickOnPants() throws InterruptedException {
        new HomePage().mouseHoverOnMenBottomsAndClick();
    }

    @And("I mouse hover on product name Cronus Yoga Pant and click on size")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() {

    }

    @And("I mouse Hover on product name Cronus Yoga Pant and click on colour Black")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() throws InterruptedException {
        new MenPantsPage().mouseHoverOnPantAndClick();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on Add to cart button")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        new MenPantsPage().clickOnAddToCart();
    }

    @Then("I verify the text {string}")
    public void iVerifyTheText(String text) {
        verifyTwoStrings(text, By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    }

    @And("I click on Shopping cart link into message")
    public void iClickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        new MenPantsPage().clickOnShoppingCart();
    }

    @Then("I verify the text of {string}")
    public void iVerifyTheTextOf(String text) {
        verifyTwoStrings(text,By.xpath("//span[@class='base']"));
    }

    @Then("I verify the product name {string}")
    public void iVerifyTheProductName(String text) {
        verifyTwoStrings(text,By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"));
    }

    @Then("I Verify the product size {string}")
    public void iVerifyTheProductSize(String text) {
        verifyTwoStrings(text,By.xpath("//dd[contains(text(),'32')]"));
    }

    @Then("I verify the product colour {string}")
    public void iVerifyTheProductColour(String text) {
        verifyTwoStrings(text,By.xpath("//dd[contains(text(),'Black')]"));
    }
}
