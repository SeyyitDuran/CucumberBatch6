package com.eurotech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends BasePage {//don't forget inherit

    @FindBy(css = "#post-form-btn")
    public WebElement submitBtn;

    @FindBy(id="post-form-title")
    public WebElement title;

    @FindBy(id="post-form-textarea")
    public WebElement post;

    @FindBy(xpath = "//*[text()='Post Created']")
    public WebElement createdMessage;
    /*
    we can create method - not dynamic
     */


}
