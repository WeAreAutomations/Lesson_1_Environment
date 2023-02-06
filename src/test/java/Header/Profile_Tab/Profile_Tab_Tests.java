package Header.Profile_Tab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static Main_code.MainCode.driver;

public class Profile_Tab_Tests {


    @Parameters({"MyProfile_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_1 Header - profile - MyProfile tab")
    public void case_1(String MyProfile_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_1 Header - profile - MyProfile tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement profileTab = driver.findElement(By.xpath("//div[@class=\"profile-block\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(profileTab).perform();

        Thread.sleep(500);
        WebElement MyProfile = driver.findElement(By.xpath("//a[@data-test-id=\"profile\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", MyProfile);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, MyProfile_Pg_Url);
        //driver.quit();
    }

    @Parameters({"verification_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_2 Header - profile - verification tab")
    public void case_2(String verification_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_2 Header - profile - verification tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement profileTab = driver.findElement(By.xpath("//div[@class=\"profile-block\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(profileTab).perform();

        Thread.sleep(500);
        WebElement MyProfile = driver.findElement(By.xpath("//a[@data-test-id=\"verification\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", MyProfile);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, verification_Pg_Url);
        //driver.quit();
    }
    @Parameters({"personal_data_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_3 Header - profile - personal data tab")
    public void case_3(String personal_data_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_3 Header - profile - personal data tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement profileTab = driver.findElement(By.xpath("//div[@class=\"profile-block\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(profileTab).perform();

        Thread.sleep(500);
        WebElement personal = driver.findElement(By.xpath("//a[@data-test-id=\"personal data\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", personal);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, personal_data_Pg_Url);
        //driver.quit();
    }

    @Parameters({"account_security_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_4 Header - profile - account security tab")
    public void case_4(String account_security_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_4 Header - profile - account security tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement profileTab = driver.findElement(By.xpath("//div[@class=\"profile-block\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(profileTab).perform();

        Thread.sleep(500);
        WebElement personal = driver.findElement(By.xpath("//a[@data-test-id=\"account security\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", personal);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, account_security_Pg_Url);
        //driver.quit();
    }

    @Parameters({"account_referral_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_5 Header - profile - account referral tab")
    public void case_5(String account_referral_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_5 Header - profile - account referral tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement profileTab = driver.findElement(By.xpath("//div[@class=\"profile-block\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(profileTab).perform();

        Thread.sleep(500);
        WebElement accountReferral = driver.findElement(By.xpath("//a[@data-test-id=\"account referral\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", accountReferral);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, account_referral_Pg_Url);
        //driver.quit();
    }

    @Parameters({"api_management_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_6 Header - profile - api management tab")
    public void case_6(String api_management_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_6 Header - profile - api management tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement accountReferral = driver.findElement(By.xpath("//div[@class=\"profile-block\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(accountReferral).perform();

        Thread.sleep(500);
        WebElement apiManagement = driver.findElement(By.xpath("//a[@data-test-id=\"api management\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", apiManagement);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, api_management_Pg_Url);
        //driver.quit(); data-test-id="lang dropdown"
    }

}
