package com.demoblaze.pages;

import com.demoblaze.utilities.ConfigurationReader;
import org.junit.Assert;

public class HomePage extends BasePage{

    public void verifyLogin(){
        String actualUsername=nameofuser.getText();
        String expectedUsername= ConfigurationReader.get("username");
        Assert.assertTrue(actualUsername.contains(expectedUsername));
    }

    public void verifyLogin(String expectedUsername){
        String actualUsername=nameofuser.getText();
        Assert.assertTrue(actualUsername.contains(expectedUsername));
    }
}
