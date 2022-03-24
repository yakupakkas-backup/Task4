package com.task4.POM;

import com.task4.Utilities.BrowserUtils;
import com.task4.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"]/span)[2]")
    public WebElement proceedTheckoutElement;

    @FindBy(id = "total_product")
    public WebElement totalProductElement;

    public void proceedTocheckoutMethod() {
        try {
            BrowserUtils.waitForClickabilility(proceedTheckoutElement,5);
            BrowserUtils.clickWithJS(proceedTheckoutElement);
        } catch (Exception e) {
            BrowserUtils.clickWithWait(proceedTheckoutElement, 5);
        }
    }
}
