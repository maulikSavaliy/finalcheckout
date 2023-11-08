package org.example;

import org.testng.annotations.Test;

public class Testsuit extends Basetest {
    //cteate object of handelaAllert class to acsses all property
    HandelaAllert handelaAllert = new HandelaAllert();
    ChangeCourency changeCourency=new ChangeCourency();
    NewRealeseAndComment newRealeseAndComment=new NewRealeseAndComment();
    CompairallProductnamewithSearch compairallProductnamewithSearch=new CompairallProductnamewithSearch();

    HomePage homePage=new HomePage();
    SearchProduct searchProduct=new SearchProduct();
    // create object of login page
    Login login=new Login();
    // create Addcart class object for use of methods
    AddonCart addonCart=new AddonCart();

    //create a object for shipping cart for use of method
    ShiptinCart shiptinCart=new ShiptinCart();

    //@Test is use for create a multipul method run in a one class
    @Test
    public void userShouldBeClickOnSerchButtonWhenHandleaAllertpopup() {
        //call a method from handelaAllertclass
        handelaAllert.handleaSearchButtonAllert();
    }

    @Test
    // create a testcase for allert button for community poll
    public void userShouldbeClickOnCommunityPollButtonWhenAcsseptAllertPopup()
    {
        handelaAllert.handelacommunitypollAller();
    }

    @Test
    //create a tesr for currency change and compair
    public void userShouldbechangeCurrencyAndVerifyCurrencywithProductPrice()
    {
        changeCourency.UsershoudbeChangecurrency();
        //changeCourency.getAllProductPrice();
    }
    @Test
    //create a tet to comment and conformation comment
    public void userShouldbeclickonNewRealeseAndtypecommentAndVerifyComment()
    {
        newRealeseAndComment.clickOnNonCommerceNewRealese();
    }
    @Test
    //create a test for search product by first name and compair that name with all product list
    public void userShouldbeSerachProductAndCompaitproductnameWithAllproductList()
    {
        searchProduct.clickonSearchBox();
        compairallProductnamewithSearch.compaitAllproductNameWithSearchProduct();
    }

    @Test
    // create a test for product checkout
    public void UserShouldbeRegisterandLoginAndCheckOutProductSucsessfully()
    {
        homePage.userShouldBeRegister();
        login.usershoudbeloginn();
        homePage.userSHuolsBeSelectProduct();
        addonCart.UserAddOnCartappleMacBookPro13inch();
        shiptinCart.userShoudBeClickOnChexkOut();
        shiptinCart.enterBullingdetail();

    }

}//mn123420231308091314@gmail.com
