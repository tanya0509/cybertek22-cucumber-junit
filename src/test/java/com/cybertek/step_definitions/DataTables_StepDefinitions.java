package com.cybertek.step_definitions;

import com.cybertek.pages.DropDownPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    LibraryLoginPage loginPage = new LibraryLoginPage();
    DropDownPage dropDownPage = new DropDownPage();


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
       Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {

        //1 - Get the dropdown as a select object
        Select monthDropdown = new Select(dropDownPage.month);




        //2 - Get all the options from the dropdown and store inside of a List
       List<WebElement>  actualMonthsAsWebElements = monthDropdown.getOptions();

       //this line does the same as the commented lines bellow
       Assert.assertEquals(expectedList, BrowserUtils.getElementsText(actualMonthsAsWebElements));

 //      //3- Convert the actualMonths from List<WebElements> to List<String>
//        List<String> actualMonthsAsString = new ArrayList<>();
//
//        for (WebElement each : actualMonthsAsWebElements) {
//
//            actualMonthsAsString.add(each.getText());
//
//        }
//
//        Assert.assertEquals(expectedList, actualMonthsAsString);



    }




    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        //just print out the size and bellow the value of the list
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);
    }

    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }
    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {
       loginPage.emailInput.sendKeys(loginInfo.get("username"));
       loginPage.passwordInput.sendKeys(loginInfo.get("password"));

       loginPage.signIn.click();
    }


    @Then("user should see title is Library")
    public void userShouldSeeTitleIsLibrary() {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
}
