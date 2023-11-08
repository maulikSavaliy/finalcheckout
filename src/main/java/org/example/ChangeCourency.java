package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class ChangeCourency extends Utils
{
    public String sign="$";
    public void UsershoudbeChangecurrency()
    {
        selectElementwithIndex(By.cssSelector("select#customerCurrency"),0);
        Assert.assertEquals(getTextFromElement(By.xpath("//select[@id=\"customerCurrency\"]/option[1]")),"US Dollar");
    }
    public void getAllProductPrice()
    {
        // create list of element
        List<WebElement> productprice =driver.findElements(By.xpath("//div[@class=\"prices\"]"));

        //sout size og element
        System.out.println(productprice.size());

        //creat new list of productpricr snd get price from thst element
        List<String> productpricelist =new ArrayList<>();

        //use foreach for get price from each element
        for (WebElement price:productprice)
        {
         productpricelist.add(price.getText());
        }
        System.out.println(productpricelist);

        //use a for mrthod for check '$' symbol present in price or not
        for (int i = 0; i < productpricelist.size(); i++)
        {
            // in that for use of if th check price have symbole or not
            if (productpricelist.get(i).contains(sign))
            {
                System.out.println(sign + " price have this symbol");
            }
            else 
            {
                System.out.println( sign + " price have not this symbol");
                
            }
        }
//        for (String price1:productpricelist)
//        {
//            productpricelist.add(price1);
//             Assert.assertTrue(price1.contains(sign),"price have not this sign :");
//        }
    }
}
