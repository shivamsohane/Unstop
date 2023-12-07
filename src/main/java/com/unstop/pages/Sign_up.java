package com.unstop.pages;

import com.unstop.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sign_up extends TestBase {


    // PageFactory or ObjectRepository
    @FindBy(xpath = "//div[@id='sign-up']")
    WebElement Signup;
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement LastName;
    @FindBy(xpath = "//input[@id='email_address']")
    WebElement email_address;
    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement mobile_number;
    @FindBy(xpath = "//*[@id='choose_password']")
    WebElement Pass;
    @FindBy(xpath = "//*[@id='confirm_password']")
    WebElement confirm_password;
    @FindBy(xpath = "//label[@for='agreed']")
    WebElement terms_condition;
    @FindBy(xpath = "//button[@class='gtm_step1 waves-effect']")
    WebElement Next;
    @FindBy(xpath = "//input[@id='username']")
    WebElement Username;
    @FindBy(xpath = "//img[@alt='Male']")
    WebElement Gender;
    @FindBy(xpath = "//img[@alt='Professional']")
    WebElement UserType;
    @FindBy(xpath = "//input[@id='organisation-organisation_select_input']")
    WebElement Organisation;
    @FindBy(xpath = "//input[@id='cities_input']")
    WebElement City;
    @FindBy(xpath = "//div[@class='error_m ng-star-inserted']")
    WebElement FirstNameError;
    @FindBy(xpath = "//div[@class='error_m ng-star-inserted']")
    WebElement EmailError;
    @FindBy(xpath = "//div[@class='error_m ng-star-inserted']")
    WebElement mobile_numberError;
    @FindBy(xpath = "//div[@class='error_m ng-star-inserted']")
    WebElement PassError;
    @FindBy(xpath = "//div[@class='error_m ng-star-inserted']")
    WebElement confirm_passwordError;
    @FindBy(xpath = "//div[@class='error_m ng-star-inserted']")
    WebElement UsernameError;
    @FindBy(xpath = "//li[@id='organisation-organisation_select_list_item_0']")
    WebElement Organisationlist;
    @FindBy(xpath = "//li[@id='cities_list_item_0']")
    WebElement Citylist;
    @FindBy(xpath = "//button[@class='waves-effect gtm_step4']")
    WebElement Finish;





    JavascriptExecutor js = (JavascriptExecutor) driver;

    public Sign_up() {
        PageFactory.initElements(driver, this);
    }

    public String validateSignUpPage() {
        Signup.click();

        return driver.getTitle();
    }

    public String validateFirstName() {
        js.executeScript("window.scrollBy(0, 1000)");
        Signup.click();
        FirstName.sendKeys(" ");
        Next.click();
        return FirstNameError.getText();

    }

    public String validateMobile_number() {
        js.executeScript("window.scrollBy(0, 1000)");
        Signup.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("User");
        Username.sendKeys("Shivamso_123");
        email_address.sendKeys("abc@gmail.com");
        mobile_number.sendKeys(" ");
        Next.click();
        return mobile_numberError.getText();

    }

    public String validatePassword() {
        js.executeScript("window.scrollBy(0, 1000)");
        Signup.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("User");
        Username.sendKeys("Shivamso_123");
        email_address.sendKeys("abc@gmail.com");
        mobile_number.sendKeys("7053490837");
        Pass.sendKeys(" ");
        Next.click();
        return PassError.getText();


    }

    public String validateconfirm_password() {
        js.executeScript("window.scrollBy(0, 1000)");
        Signup.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("User");
        Username.sendKeys("Shivamso_123");
        email_address.sendKeys("abc@gmail.com");
        mobile_number.sendKeys("7053490837");
        Pass.sendKeys("abc@1234");
        confirm_password.sendKeys(" ");
        Next.click();
        return confirm_passwordError.getText();
    }

    public String validateterms_condition() {

        return terms_condition.getText();
    }

    public String validateNext() {
        return Next.getText();
    }

    public String validateUsername() {
        Signup.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("User");
        Username.sendKeys("sdfsd");
        return UsernameError.getText();

    }

    public String validateEmail() {
        js.executeScript("window.scrollBy(0, 1000)");
        Signup.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("User");
        email_address.sendKeys("sdfsd");
        return EmailError.getText();
    }


    public void Sign_up() throws InterruptedException {
        js.executeScript("window.scrollBy(0, 1000)");
        Signup.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("User");
        Username.sendKeys("Shivamso_123");
        email_address.sendKeys("abc@gmail.com");
        mobile_number.sendKeys("7053490837");
        Pass.sendKeys("abc@1234");
        confirm_password.sendKeys("abc@1234");
        js.executeScript("document.querySelector(\".p_box.pb120.custom-scrollbar.thin\").scrollTop=1000");
        terms_condition.click();
        Next.click();
        Gender.click();
        UserType.click();
        Organisation.sendKeys("t4t");
        Thread.sleep(2000);
        Organisationlist.click();
        City.sendKeys("Delhi");
        Thread.sleep(2000);
        Citylist.click();
        Next.click();
        Finish.click();


    }

}