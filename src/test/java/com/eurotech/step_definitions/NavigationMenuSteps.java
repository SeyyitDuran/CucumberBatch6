package com.eurotech.step_definitions;


import com.beust.ah.A;
import com.eurotech.Pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenuSteps {//you should firstly run from cukesRunner to reach all

    DashboardPage dashboardPage=new DashboardPage();

    @Then("The user should navigate the dashboard page and view Welcome Teacher text")
    public void the_user_should_navigate_the_dashboard_page_and_view_welcome_teacher_text() {
        System.out.println("I navigate dashboard page");
    }
    @Then("The user should hover over Developer button and click")
    public void the_user_should_hover_over_developer_button_and_click() {
        System.out.println("I click the Developers button");
    }
    @Then("The user should view Developers text and navigate on profiles page")
    public void the_user_should_view_developers_text_and_navigate_on_profiles_page() {
        System.out.println("I navigate developers page");
    }

    @And("The user should hover overs All Posts button and click")
    public void theUserShouldHoverOversAllPostsButtonAndClick() {
        System.out.println("I click All posts button");
    }

    @Then("The user should view Posts text and navigates on posts page")
    public void theUserShouldViewPostsTextAndNavigatesOnPostsPage() {
        System.out.println("I navigate Posts page");
    }

    @And("The user should hover over My Account button and click")
    public void theUserShouldHoverOverMyAccountButtonAndClick() {
        System.out.println("I click My Account button");
    }

    @Then("The user should view Dashboard text and navigate on dashboard page")
    public void theUserShouldViewDashboardTextAndNavigateOnDashboardPage() {
        System.out.println("I navigate dashboard page");
    }

    @Then("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menuName) {
        dashboardPage.navigateMenu(menuName);

    }
    @Then("The user should be able to view header as {string}")
    public void the_user_should_be_able_to_view_header_as(String expectedHeader) {
        String actual= dashboardPage.getHeader(expectedHeader);
        Assert.assertEquals(expectedHeader,actual);
        System.out.println("actual = " + actual);
    }
}
