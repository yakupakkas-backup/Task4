package com.task4.POM;

import com.task4.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h3[.=\"Already registered?\"]")
    public WebElement alreadyRegisteredElement;

}
