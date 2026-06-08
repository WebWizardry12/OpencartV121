package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

    public AccountRegistration(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="customer.firstName")
    WebElement txtFirstName;

    @FindBy(id="customer.lastName")
    WebElement txtLastName;

    @FindBy(id="customer.address.street")
    WebElement txtAddress;

    @FindBy(id="customer.address.city")
    WebElement txtCity;

    @FindBy(id="customer.address.state")
    WebElement txtState;

    @FindBy(id="customer.address.zipCode")
    WebElement txtZipCode;

    @FindBy(id="customer.phoneNumber")
    WebElement txtPhone;

    @FindBy(id="customer.ssn")
    WebElement txtSSN;

    @FindBy(id="customer.username")
    WebElement txtUsername;

    @FindBy(id="customer.password")
    WebElement txtPassword;

    @FindBy(id="repeatedPassword")
    WebElement txtConfirmPassword;

    @FindBy(xpath="//input[@value='Register']")
    WebElement btnRegister;

    public void setFirstName(String fname) {
        txtFirstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        txtLastName.sendKeys(lname);
    }

    public void setAddress(String address) {
        txtAddress.sendKeys(address);
    }

    public void setCity(String city) {
        txtCity.sendKeys(city);
    }

    public void setState(String state) {
        txtState.sendKeys(state);
    }

    public void setZipCode(String zip) {
        txtZipCode.sendKeys(zip);
    }

    public void setPhone(String phone) {
        txtPhone.sendKeys(phone);
    }

    public void setSSN(String ssn) {
        txtSSN.sendKeys(ssn);
    }

    public void setUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void setPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void setConfirmPassword(String password) {
        txtConfirmPassword.sendKeys(password);
    }

    public void clickRegister() {
        btnRegister.click();
    }
}