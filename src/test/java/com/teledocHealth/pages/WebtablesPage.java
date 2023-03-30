package com.teledocHealth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class WebtablesPage extends BasePage {


    @FindBy(id = "___$_11__close ___$_11__close")
    public WebElement btnMinimizeChatbox;

    @FindBy(xpath = "//button[text()=' Add User']")
    public WebElement addUserBtn;

    @FindBy(xpath = "//input[@name='FirstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//label[text()='Company AAA']")
    public WebElement customerCompanyAAA;

    @FindBy(css = "input[value='15']")
    public WebElement radioBtnCompanyAAA;

    @FindBy(css = "select[name='RoleId']")
    public WebElement roleSelectDropdownMenu;

    @FindBy(name = "Email")
    public WebElement emailInput;

    @FindBy(name = "Mobilephone")
    public WebElement cellPhoneInput;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//tbody//td[text()='Bliss']")
    public WebElement firstNameBliss;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> tableRows;


    @FindBy(xpath = "//tbody/tr[3]/td[11]/button")
    public WebElement cancelBtn;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okButton;

    @FindBy(xpath = "//tr/td[text()='novak']")
    public WebElement novakUserName;

    @FindBy(xpath = "//tbody/tr/td[text()]")
    public List<WebElement> dataOnTableThatHasText;

    @FindBy(xpath = "//span[text()='First Name']")
    public WebElement firstNameColumn;

}





