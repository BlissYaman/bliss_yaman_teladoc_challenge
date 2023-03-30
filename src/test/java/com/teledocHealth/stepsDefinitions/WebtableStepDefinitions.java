package com.teledocHealth.stepsDefinitions;

import com.teledocHealth.pages.WebtablesPage;
import com.teledocHealth.utilities.BrowserUtils;
import com.teledocHealth.utilities.ConfigurationReader;
import com.teledocHealth.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebtableStepDefinitions {

    WebtablesPage webtablesPage = new WebtablesPage();

    @Given("I as the QA engineer candidate navigate to the {string}")
    public void iAsTheQAEngineerCandidateNavigateToThe(String url1) {
        // 1-> https://www.way2automation.com/  this url works
    }


    @And("I as the QA engineer candidate go to the {string} page")
    public void iAsTheQAEngineerCandidateGoToThePage(String url2) {
        // 2->  https://www.way2automation.com/angularjs-protractor/ this url NOT work
    }



    @And("I as the QA engineer land on webtables page")
    public void iAsTheQAEngineerLandOnWebtablesPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
        String expectedTitleOfPage = "Protractor practice website - WebTables";
        String actualTitleOfPage = Driver.getDriver().getTitle();
        boolean pageTitle = expectedTitleOfPage.equals(actualTitleOfPage);
        Assert.assertTrue(pageTitle);

        int numberOfRomsBeforeAddition = webtablesPage.tableRows.size();
        System.out.println("Before Addition of Bliss data= " + numberOfRomsBeforeAddition);

    }

    @Given("I as the QA engineer click the Add User button")
    public void iAsTheQAEngineerClickTheAddUserButton() {
        webtablesPage.addUserBtn.click();
    }


    @And("I as the QA engineer choose a company")
    public void iAsTheQAEngineerChooseACompany() {

        webtablesPage.customerCompanyAAA.click();
        boolean is_selected = webtablesPage.radioBtnCompanyAAA.isSelected();
        Assert.assertTrue(is_selected);

    }



    @And("I as the QA engineer select a {string}")
    public void iAsTheQAEngineerSelectARol(String role) {
        Select select = new Select(webtablesPage.roleSelectDropdownMenu);
        select.selectByVisibleText(role);
    }
//
//    @And("I as the QA engineer enter my E-mail")
//    public void iAsTheQAEngineerEnterMyEMail() {
//        webtablesPage.emailInput.sendKeys("bliss@gmail.com");
//
//    }



    @And("I as the QA engineer click the Save button")
    public void iAsTheQAEngineerClickTheSaveButton() {
        webtablesPage.saveBtn.click();


    }

    @Then("My info is added to the table")
    public void myInfoIsAddedToTheTable() {
        boolean blissIsDisplayed = webtablesPage.firstNameBliss.isDisplayed();
        Assert.assertTrue(blissIsDisplayed);

        int numberOfRowsAfterAddition = webtablesPage.tableRows.size();
        System.out.println("After Bliss Data Addition= " + numberOfRowsAfterAddition);

        if (numberOfRowsAfterAddition > 7) {
            System.out.println("My info has been added successfully");
        } else {
            System.out.println("My data hasn't been added yet");
        }
    }


    // ----------------------------------------------------

    @And("I as the QA engineer enter {string} for name")
    public void iAsTheQAEngineerEnterName(String firstName) {
        webtablesPage.firstNameInput.sendKeys(firstName);
    }

    @And("I as the QA engineer enter {string} for last name")
    public void iAsTheQAEngineerEnterLastName(String lastName) {
        webtablesPage.lastNameInput.sendKeys(lastName);
    }

    @And("I as the QA engineer enter {string} for user name")
    public void iAsTheQAEngineerEnterUserName(String userName) {
        webtablesPage.userNameInput.sendKeys(userName);
    }

    @And("I as the QA engineer enter {string} for password")
    public void iAsTheQAEngineerEnterPassword(String password) {
        webtablesPage.passwordInput.sendKeys(password);

    }

    @And("I as the QA engineer enter my {string} for email")
    public void iAsTheQAEngineerEnterMyForEmail(String email) {
        webtablesPage.emailInput.sendKeys(email);
    }

    @And("I as the QA engineer enter my {string} for cell phone")
    public void iAsTheQAEngineerEnterMyForCellPhone(String cellPhone) {
        webtablesPage.cellPhoneInput.sendKeys(cellPhone);
    }

    // ---------------------

    @Given("data of user name of novak is on the webtable")
    public void dataOfUserNameOfNovakIsOnTheWebtable() {

       boolean novakUserName = webtablesPage.novakUserName.isDisplayed();
       Assert.assertTrue(novakUserName);
    }

    @And("I as the QA engineer click novak's cancel button")
    public void iAsTheQAEngineerDeleteNovakDateFromWebtable() {

        webtablesPage.cancelBtn.click();

    }

    @And("I as the QA engineer click OK button")
    public void iAsTheQAEngineerClickOKButton() {
        webtablesPage.okButton.click();
        BrowserUtils.waitForVisibility(webtablesPage.firstNameColumn,10);

    }


    @Then("novak's data is deleted from the webtable")
    public void novakSDataIsDeletedFromTheWebtable() {


       List<WebElement> dataOnTable= webtablesPage.dataOnTableThatHasText;

       for (WebElement eachData : dataOnTable) {
            String eachString=eachData.getText();
            if(eachString.contains("novak")){
                System.out.println("novak is Not deleted");
            }else{
                System.out.println("novak customer info is deleted");
                break;
            }
        }


//    2nd WAY
//        try {
//            boolean novakUserName= webtablesPage.novakUserName.isDisplayed();
//            System.out.println(novakUserName);
//        } catch (NoSuchElementException e){
//            System.out.println("Data of novak is not on the list");
//              e.printStackTrace();
//        }




    }
}