package com.eurotech.Pages;

import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {//finfd it

//    public LoginPage() {
//        PageFactory.initElements(Driver.get(), this);//special constructor, like register, main etc.
//    }  after extend we don't need again

    @FindBy(id = "rcc-confirm-button")//for each one we need
    public WebElement iUnderstandButton; //

    @FindBy(name="email")
    public WebElement usernameInput;

    @FindBy(name="password")
    public WebElement passwordInput;

    @FindBy(id="loginpage-form-btn")
    public WebElement loginButton;

    @FindBy(xpath= "//div[@class='alert alert-danger']")
    public WebElement warningMessage;



    //@FindAll // use with multiple locater, one of them enough
    //@FindBy  // use with multiple locater, all of them should match


    public void login(String userName, String password){
        iUnderstandButton.click();
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginAsTeacher(){
        String userName= ConfigurationReader.get("usernameTeacher");
        String password=ConfigurationReader.get("passwordTeacher");
        login(userName,password);
    }

    public void loginAsStudent(){
        String userName= ConfigurationReader.get("usernameStudent");
        String password=ConfigurationReader.get("passwordStudent");
        login(userName,password);
    }

    public void loginAsDeveloper(){
        String userName= ConfigurationReader.get("usernameDeveloper");
        String password=ConfigurationReader.get("passwordDeveloper");
        login(userName,password);
    }

    public String getWarningMessage(String expectedErrorMessage){
        String actualMessage =null;
        if(expectedErrorMessage.contains("@")){
            actualMessage = usernameInput.getAttribute("validationMessage");
        }else if(expectedErrorMessage.contains("characters")){
            actualMessage =passwordInput.getAttribute("validationMessage");
        }else {
            actualMessage = warningMessage.getText();
        }

        return actualMessage;
    }

}
