package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {


    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver",".\\src\\main\\java\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String Test_Results;

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath("//a[contains(.,'SIGN-ON')]")).click();

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        if(driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed())
        {
            Test_Results = "PASSED";
        }else
            Test_Results = "FAILED";

        System.out.println(Test_Results);

        driver.close();

    }
}