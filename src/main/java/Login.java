import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

public static void main (String[] args) {
    //location of chrome driver
    System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    //maximize the browser
    driver.manage().window().maximize();

    //launching the website that we are testing
    driver.get("http://demo.guru99.com/test/newtours");

    //clicking the sign on button
    driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();

    //typing the username
    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

    //typing the password
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

    //clicking the Submit button
    driver.findElement(By.xpath("//input[@name='submit']")).click();

    //We are checking if the Login Successfully element is Displayed
    if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed()) {
        //if Element is Displayed we are saying our tests passed
        System.out.println("PASSED");
    } else
        //else...if element id not Displayed we are saying our tests failed
        System.out.println("FAILED");

    //we are closing the browser
    driver.close();
}
}
