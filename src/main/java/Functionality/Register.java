package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath(("//a[contains(text(),'REGISTER')]"))).click();


        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("FirstName");

        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LastName");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0761231234");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("DemoUser");

        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("99");

        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Guru City");

        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Selenium");

        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1111");

        driver.findElement(By.xpath("//select[@name='country']")).sendKeys("SOUTH AFRICA");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String Username_Verification= driver.findElement(By.xpath("//b[contains(.,'Note: Your user name is test@test.com.')]")).getText();

        if (Username_Verification.equalsIgnoreCase("Note: Your user name is test@test.com.")){
            System.out.println("User name successfully displayed");
        }else
        {
            System.out.println("Username not displayed");
        }
        driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String HomePage_verification= driver.findElement(By.xpath(("//h3[contains(.,'Login Successfully')]"))).getText();

        if(HomePage_verification.equalsIgnoreCase("Login Successfully"))
        {
            System.out.println("Successfully Logged In");
        }else
            System.out.println("Logged in Unsuccessfully , The user was supposed to see : " + HomePage_verification);

        driver.quit();
    }
}
