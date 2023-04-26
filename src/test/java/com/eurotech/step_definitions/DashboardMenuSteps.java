package com.eurotech.step_definitions;

import com.eurotech.Pages.DashboardPage;
import com.eurotech.Pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardMenuSteps {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Then("The user should be able see following menu")
    public void the_user_should_be_able_see_following_menu(List<String> expectedList) {
        System.out.println("Menu options size = " + expectedList.size());
        System.out.println("Menu options " + expectedList);

        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);

        Assert.assertEquals(expectedList, actualList);
    }

}
