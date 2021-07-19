package Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_To_Guru99_Demo {

    private WebDriver driver;

    public Login_To_Guru99_Demo(WebDriver driver)
    {
        this.driver=driver;
    }
    @FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
    WebElement Sign_In_Link;

    @FindBy (xpath = "//input[@name='userName']")
    WebElement Username;

    @FindBy (xpath = "//input[@name='password']")
    WebElement Password;

    @FindBy (xpath = "//input[@name='submit']")
    WebElement Submit_Button;

    @FindBy (xpath = "//h3[contains(.,'Login Successfully')]")
    WebElement Welcome_Message;

    public void Click_Sign_On_Link()
    {
        WebDriverWait sign_on=new WebDriverWait(driver,20);
        sign_on.until(ExpectedConditions.visibilityOf(Sign_In_Link));

        Sign_In_Link.click();
    }

    public void Enter_Username()
    {
        WebDriverWait username=new WebDriverWait(driver,20);
        username.until(ExpectedConditions.visibilityOf(Username));

        Username.sendKeys("Test");
    }
    public void Enter_Password()
    {
        WebDriverWait password=new WebDriverWait(driver,20);
        password.until(ExpectedConditions.visibilityOf(Password));

        Password.sendKeys("Test");
    }
    public void Click_Submit_Button()
    {
        WebDriverWait submit=new WebDriverWait(driver,20);
        submit.until(ExpectedConditions.visibilityOf(Submit_Button));
        Submit_Button.click();
    }
    public void Verify_Welcome_Message()
    {
        WebDriverWait welcome_msg=new WebDriverWait(driver,30);
        welcome_msg.until(ExpectedConditions.visibilityOf(Welcome_Message));

        Assert.assertTrue(Welcome_Message.isDisplayed());
    }

}
