package com.task4.StepDefs;

import com.task4.POM.CartPage;
import com.task4.POM.CheckoutPage;
import com.task4.POM.MainPage;
import com.task4.POM.SummerDressesPage;
import com.task4.Utilities.BrowserUtils;
import com.task4.Utilities.ConfigurationReader;
import com.task4.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.By;

public class SummerDeressesStepDef {
    MainPage mainpage = new MainPage();
    SummerDressesPage summerDresses = new SummerDressesPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("User is on the Summer Dresses page")
    public void userIsOnTheSummerDressesPage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        mainpage.navigateToModule("Summer Dresses");

    }

    @When("User clicks on the product that wants to purchase and add it to the cart")
    public void userClicksOnTheProductThatWantsToPurchaseAndAddItToTheCart() {
        summerDresses.addToCart();
    }

    @And("User Proceed To Checkout")
    public void userProceedToCheckout() {
        summerDresses.proceedToChecout();
    }

    @Then("verify that summer dresses can be added to the cart")
    public void verifyThatSummerDressesCanBeAddedToTheCart() {
        assertNotEquals(cartPage.totalProductElement.getAttribute("value"), "0");
    }

    @And("verify that it’s possible to proceed to the Sign in section")
    public void verifyThatItSPossibleToProceedToTheSignInSection() {
        cartPage.proceedTocheckoutMethod();
        //BrowserUtils.waitForPresenceOfElement(checkoutPage.alreadyRegisteredElement,"Already registered?",3);
        BrowserUtils.waitForPageToLoad(3);
        assertTrue(checkoutPage.alreadyRegisteredElement.isDisplayed());
    }
}
