package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShiptinCart extends Utils
{
    public String expectedresult="Your order has been successfully processed!...";
    public void userShoudBeClickOnChexkOut()
    {
        // clik on shipping cart
        clickOnElement(By.xpath("//a[text()='shopping cart']"));

        // click on check box
        clickOnElement(By.cssSelector("input#termsofservice"));

        //click on check out button
        clickOnElement(By.cssSelector("button#checkout"));
    }

    //create new methode for bulling detail
    public void enterBullingdetail()
    {
        //select country by text
        selectByText(By.cssSelector("select#BillingNewAddress_CountryId"),"India");

        // select state by index
        //selectElementwithIndex(By.cssSelector("select#BillingNewAddress_StateProvinceId"),0);

        // enter a city name
        enterValueinElement(By.cssSelector("input#BillingNewAddress_City"),"mumbai");

        // enter address
        enterValueinElement(By.cssSelector("input#BillingNewAddress_Address1"),"sector 4,amrapali,noida");

        // enter a zipcode
        enterValueinElement(By.cssSelector("input#BillingNewAddress_ZipPostalCode"),"123455");

        // enter a phone number
        enterValueinElement(By.cssSelector("input#BillingNewAddress_PhoneNumber"),"123456789");

        //click on continue button
        clickOnElement(By.cssSelector("button.button-1.new-address-next-step-button"));

//        // use of allert for dismiss allert
//        driver.switchTo().alert().dismiss();

        // click on shipping method
        clickOnElement(By.cssSelector("input#shippingoption_1"));

        //click on continue button by class name
        clickOnElement(By.cssSelector("button.button-1.shipping-method-next-step-button"));

        // click on credit card option
        clickOnElement(By.cssSelector("input#paymentmethod_1"));

        // click on continue button of payment method
        clickOnElement(By.cssSelector("button.button-1.payment-method-next-step-button"));

        //select card catagory
        selectElementwithIndex(By.className("dropdownlists"),1);

        //enter card detail
        enterValueinElement(By.cssSelector("input#CardholderName"),"samson delux");

        //enter card number
        enterValueinElement(By.cssSelector("input#CardNumber"),"1234 4321 1234 4321");

        // select expiry month
        selectByText(By.cssSelector("select#ExpireMonth"),"01");

        // select expiry year
        selectByText(By.cssSelector("select#ExpireYear"),"2025");

        //enter a card code
        enterValueinElement(By.cssSelector("input#CardCode"),"123");

        //click on continue button
        clickOnElement(By.cssSelector("button.button-1.payment-info-next-step-button"));

        // click confrim button
        clickOnElement(By.cssSelector("button.button-1.confirm-order-next-step-button"));

        //confrom that conformation massage
        Assert.assertEquals(getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']")),expectedresult,"conformation massage are not same :");

        //click on confrim button
        clickOnElement(By.cssSelector("button.button-1.order-completed-continue-button"));

    }

}
