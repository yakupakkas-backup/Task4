package com.task4.StepDefs;

import com.task4.POM.MainPage;
import com.task4.POM.SummerDresses;
import com.task4.Utilities.ConfigurationReader;
import com.task4.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SummerDeressesStepDef {
    MainPage mainpage = new MainPage();
    SummerDresses summerDresses = new SummerDresses();

    @Given("User is on the Summer Dresses page")
    public void userIsOnTheSummerDressesPage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        mainpage.navigateToModule("Summer Dresses");

    }

    @When("User clicks on the product that wants to purchase and add it to the cart")
    public void userClicksOnTheProductThatWantsToPurchaseAndAddItToTheCart() throws InterruptedException {

        summerDresses.addToCart(summerDresses.printedChiffonDressAtcElement);
        Thread.sleep(2000);

    }

    @And("User Proceed To Checkout")
    public void userProceedToCheckout() {
    }

    @Then("verify that summer dresses can be added to the cart")
    public void verifyThatSummerDressesCanBeAddedToTheCart() {
    }

    @And("verify that it’s possible to to proceed to the Sign in section")
    public void verifyThatItSPossibleToToProceedToTheSignInSection() {
    }
}
