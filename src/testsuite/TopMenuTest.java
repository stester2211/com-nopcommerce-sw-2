package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest
{
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUpBrowser()
    {
        browserSetUp(baseUrl);
    }

    //1. userShouldNavigateToComputerPageSuccessfully
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() throws InterruptedException {
        //1.1 click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[@href='/computers']")).click();

        //1.2 Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals("Computers text not found", expectedText, actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //2. userShouldNavigateToElectronicsPageSuccessfully
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() throws InterruptedException {
        //2.1 click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']")).click();

        //2.2Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals("Electronics text not found", expectedText, actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    // 3. userShouldNavigateToApparelPageSuccessfully
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() throws InterruptedException {
        //3.1 click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[@href='/apparel']")).click();

        //3.2 Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals("Apparel text not found", expectedText, actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //4. userShouldNavigateToDigitalDownloadsPageSuccessfully
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() throws InterruptedException {
        //4.1 click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")).click();

        //4.2 Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals("Digital downloads text not found", expectedText, actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //5. userShouldNavigateToBooksPageSuccessfully
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() throws InterruptedException {
        //1. click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();

        //2. Verify the text ‘Books’
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals("Books text not found", expectedText, actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //6. userShouldNavigateToJewelryPageSuccessfully
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() throws InterruptedException {
        //6.1 click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();

        //6.2Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals("Jewelry text not found", expectedText, actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    //7. userShouldNavigateToGiftCardsPageSuccessfully
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() throws InterruptedException
    {
        //7.1 click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();

        //7.2 Verify the text ‘Gift Cards’
        String expectedText="Gift Cards";
        String actualText= driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals("Gift card text not found",expectedText,actualText);

        //Holding the screen
        Thread.sleep(2000);
    }

    @After
    public void quitBrowser()
    {
        closeBrowser();
    }

}
