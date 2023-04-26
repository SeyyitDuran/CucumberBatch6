package com.eurotech.step_definitions;

import com.eurotech.Pages.DashboardPage;
import com.eurotech.Pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        loginPage.loginAsTeacher();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {// it is not key sensitive
        loginPage.loginAsStudent();
    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        System.out.println("I enter developer credentials and click login button");
        loginPage.loginAsDeveloper();
    }

    @When("The user logs in using {string} and {string} credentials")//from features String
    public void theUserLogsInUsingAndCredentials(String username, String password) {

        System.out.println("username = " + username);
        System.out.println("password = " + password);

        loginPage.login(username, password);

    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String expectedMessage) {
        System.out.println("expectedMessage : " + expectedMessage);
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));
    }

    @When("The user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String, String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        String username = userCredentials.get("username");
        String password = userCredentials.get("password");

        loginPage.login(username, password);

        String expectedMessage = userCredentials.get("message");

        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));


    }


    @Then("The user should see a warning message {string}")
    public void theUserShouldSeeAnErrorMessage(String expectedWarning)  {
            String actualMessage= loginPage.getWarningMessage(expectedWarning);
            Assert.assertEquals(expectedWarning,actualMessage);
        }
//        switch (expectedWarning){
//            case "Please include a valid email!":
//                Assert.assertEquals(expectedWarning,loginPage.warningMessage.getText());
//
//            case "Invalid Credentials!":
//                Assert.assertEquals(expectedWarning,loginPage.warningMessage.getText());
//
//            case "Please include an '@' in the email address. 'eurotech' is missing an '@'.":
//                String message=loginPage.usernameInput.getAttribute("validationMessage");
//                Assert.assertEquals(expectedWarning,message);
//                System.out.println(message);
//        }
}
