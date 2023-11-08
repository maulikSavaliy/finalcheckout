package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CompairallProductnamewithSearch extends Utils
{
    // create a object of search product for use of variable
    SearchProduct searchProduct=new SearchProduct();
    //public String name="Nike";
    public void compaitAllproductNameWithSearchProduct()
    {
        // create a list of web element
        List<WebElement> productname =driver.findElements(By.xpath("//div[@class=\"product-item\"]/div[2]/h2"));
        // sout a size od element
        System.out.println(productname.size());
        // cvreate a list of webelement name list
        List<String> productnamelist = new ArrayList<>();
        // use a foe each foe add a name in list
        for (WebElement title:productname)
        {
            productnamelist.add(title.getText());
        }
        System.out.println(productnamelist);
        //use a forr loop for comparing a cotain
        for (int i = 0; i < productnamelist.size(); ++i)
        {
            // use a if condition for nike word in that title or not
            if (productnamelist.get(i).contains(searchProduct.name))
            {
               System.out.println(productnamelist.get(i) + " have a " + searchProduct.name   + " word");
            }else
            {
                Assert.assertTrue(productnamelist.get(i).contains("nike"),productnamelist.get(i));
            }

        }

    }
}
