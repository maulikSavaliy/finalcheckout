package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public String email = "mn1234" + timeStamp() + "@gmail.com";

    public String password = "mn1234";

    public void userShouldBeRegister() {
        // click on register button
        clickOnElement(By.cssSelector("a.ico-register"));

        //enter a value in firstname
        enterValueinElement(By.cssSelector("input#FirstName"), "robim");

        //enter a value in last name
        enterValueinElement(By.cssSelector("input#LastName"), "Samson");

        //enter email
        enterValueinElement(By.cssSelector("input#Email"), email);

        //print email
        System.out.println(email);

        //enter password
        enterValueinElement(By.cssSelector("input#Password"), password);

        //enter confirm password
        enterValueinElement(By.cssSelector("input#ConfirmPassword"), password);

        // click on register button
        clickOnElement(By.cssSelector("button#register-button"));

    }

    public void userSHuolsBeSelectProduct()
    {
        // click on product
        clickOnElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/apple-macbook-pro-13-inch\"]"));

    }

}
