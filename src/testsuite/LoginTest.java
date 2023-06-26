package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void setUp()
    {
        browserSetUp(baseUrl);
    }

    // 1. userShouldNavigateToLoginPageSuccessfully
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException
    {
        //1.1 Click on Login Link
        driver.findElement(By.linkText("Log in")).click();

        //Holding the screen
        Thread.sleep(2000);

        //1.2 Verify the text ‘Welcome, Please Sign In!’
        String expectedText ="Welcome, Please Sign In!";
        String actualText= driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Welcome text not displayed in login page", expectedText,actualText);
    }

    //2. userShouldLoginSuccessfullyWithValidCredentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException
    {
        //2.1 Click on the login link
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        //2.2 Enter the valid username
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vpatel1322@gmail.com");

        //2.3 Enter valid password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("v129456");

        //Holding the screen
          Thread.sleep(2000);

        //2.4 Click on Log In button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //2.5 Verify the ‘Log out’ text is display
        String expectedText="Log out";
        String actualText= driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        Assert.assertEquals("Log out text is not display",expectedText,actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //3. verifyTheErrorMessage
    @Test
    public void verifyTheErrorMessage() throws InterruptedException
    {
        //3.1 click on the ‘Login’ link
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        //3.2 Enter invalid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vpatel@gmail.com");

        //3.3 Enter invalid password
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("v456");

        //3.4 Click on Login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //Holding the screen
        Thread.sleep(2000);

        /*3.5 Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/

        String expectedText="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualText=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        Assert.assertEquals("Login fail message not display",expectedText,actualText);

        //Holding the screen
        Thread.sleep(1000);

    }

    @After
    public void quitBrowser()
    {
        closeBrowser();
    }
}
