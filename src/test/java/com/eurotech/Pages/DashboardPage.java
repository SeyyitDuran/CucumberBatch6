package com.eurotech.Pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{
    //we need to keep separate our element for readability, so each page create new page class

    @FindBy(css="#dashboard-p1")
    public WebElement welcomeMessage;

    @FindBy(css = ".nav__menu-item")
    public List<WebElement> menuList;

    @FindBy(linkText = "Developers")
    public WebElement developers;

    @FindBy(linkText = "All Posts")
    public WebElement allPosts;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(css=".btn.btn-light")
    public List<WebElement> dashboardList;

    @FindBy(xpath = "//*[text()='Apple']/../td[2]")//protect the adding element situation
    public WebElement jobTitle;

    public void navigateMenu(String menuName){//using dynamic by method is important cover this part
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }

    public void navigateSubMenu(String menuName){
        Driver.get().findElement(By.xpath("//span[text()='"+menuName+"']")).click();
    }

    public String getExperienceTitle(String titleName){
        return Driver.get().findElement(By.xpath("//td[text()='"+titleName+"']/../td[2]")).getText();
        //td[text()='Test Automation Engineer']
    }

    public String getCompanyName(String companyName){
        return Driver.get().findElement(By.xpath("//td[text()='"+companyName+"']/../td[1]")).getText();
    }

    public String getHeader(String name){
       return Driver.get().findElement(By.xpath("//*[text()='"+name+"']")).getText();
    }
}
