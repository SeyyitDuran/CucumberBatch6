package com.eurotech.Pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    /*
    we can't create object from this class just with inherit, we need to protect
    POM - design pattern in selenium
    Page Factory -- is class in selenium using which we can create page object model
     */
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }//it allows to reach web elements and methods in this class

}
