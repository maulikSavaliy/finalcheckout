package org.example;

import org.openqa.selenium.By;

public class Login extends Utils
{

    // create object of homepage to use of variable
    HomePage homePage=new HomePage();
    public void usershoudbeloginn()
    {

        // click on login button
        clickOnElement(By.cssSelector("a.ico-login"));

        //enter email
        enterValueinElement(By.cssSelector("input#Email"), homePage.email);

        // enter a password
        enterValueinElement(By.cssSelector("input#Password"),homePage.password);

        // click on register button
        clickOnElement(By.cssSelector("button.button-1.login-button"));
    }
}
