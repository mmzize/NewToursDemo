package Tests;

import Functionality.Login_To_Guru99_Demo;
import Setup.Setup_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Guru99_Demo_Tests {

    public Guru99_Demo_Tests() {}
    private WebDriver driver =Setup_Class.startBrowserOfChoice("http://demo.guru99.com/test/newtours","chrome");

    @Test
    public void Login_Tests()
    {
        Login_To_Guru99_Demo login_Test= PageFactory.initElements(driver,Login_To_Guru99_Demo.class);
        login_Test.Click_Sign_On_Link();
        login_Test.Enter_Username();
        login_Test.Enter_Password();
        login_Test.Click_Submit_Button();
        login_Test.Verify_Welcome_Message();
    }
    @AfterSuite
    private void Close_Browser()
    {
        driver.quit();
    }


}
