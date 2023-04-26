package com.eurotech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {//don't forger Base inherit

    @FindBy (css = "#editprofile-from-github-input")
    public WebElement githubUsername;

    @FindBy (linkText = "Go Back")//if element contain href we can use link test
    public WebElement goBackButton;


}
