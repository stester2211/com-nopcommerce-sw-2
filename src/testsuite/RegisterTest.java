package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest
{
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void openBrowser()
    {
        browserSetUp(baseUrl);
    }

    //1. userShouldNavigateToRegisterPageSuccessfully
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() throws InterruptedException
    {
        //1.1 click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        //1.2 Verify the text ‘Register’
        String expectedText="Register";
        String actualText= driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Register text not found",expectedText,actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //2. userSholdRegisterAccountSuccessfully
    @Test
    public void userSholdRegisterAccountSuccessfully() throws InterruptedException
    {
        //2.1 click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        //2.2 Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();

        //2.3 Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vishwa");

        //2.4 Enter Last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");

        //2.5 Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("11");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("July");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1996");

        //2.6 Enter Email address
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("vpatel1322@gmail.com");

        //2.7 Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("v129456");

        //2.8 Enter Confirm password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("v129456");

        //2.9 Click on REGISTER button
        driver.findElement(By.xpath("//button[@class='button-1 register-next-step-button']")).click();

        //2.10 Verify the text 'Your registration completed’
        String expectedText="Your registration completed";
        String actualText=driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Register complete text not found",expectedText,actualText);

        //Hold Screen
        Thread.sleep(2000);
    }


    @After
    public void quitBrowser()
    {
        closeBrowser();
    }
}
