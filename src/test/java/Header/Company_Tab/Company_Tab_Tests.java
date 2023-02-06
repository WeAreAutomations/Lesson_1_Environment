package Header.Company_Tab;

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

public class Company_Tab_Tests {


    @Parameters({"about_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_1 Header - Company - about tab")
    public void case_1(String about_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_1 Header - Company - about tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement marketsBtn = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        marketsBtn.click();

        Thread.sleep(500);
        WebElement spotTrading = driver.findElement(By.xpath("//a[@data-test-id=\"about\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", spotTrading);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, about_Pg_Url);

        //driver.quit();
    }

    @Parameters({"blog_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_2 Header - ieo tab")
    public void case_2(String blog_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_2 Header - Company - blog tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(500);
        WebElement spotTrading = driver.findElement(By.xpath("//a[@data-test-id=\"blog\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", spotTrading);

        Thread.sleep(5500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, blog_Pg_Url);

        //driver.quit();
    }

    @Parameters({"referralProgram_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_3 Header - Company - referral program tab")
    public void case_3(String referralProgram_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_3 Header - Company - referral program tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(1000);
        WebElement tournaments = driver.findElement(By.xpath("//a[@data-test-id=\"referral program\"]"));
        //tournaments.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", tournaments);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, referralProgram_Pg_Url);

        //driver.quit();
    }

    @Parameters({"listing_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_4 Header - Company - listing tab")
    public void case_4(String listing_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_4 Header - Company - listing tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(1000);
        WebElement tournaments = driver.findElement(By.xpath("//a[@data-test-id=\"listing\"]"));
        //tournaments.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", tournaments);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, listing_Pg_Url);

        //driver.quit();faq
    }

    @Parameters({"faq_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_5 Header - Company - faq tab")
    public void case_5(String faq_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_5 Header - Company - faq tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(1000);
        WebElement tournaments = driver.findElement(By.xpath("//a[@data-test-id=\"faq\"]"));
        //tournaments.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", tournaments);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, faq_Pg_Url);

        //driver.quit();faq
    }

    @Parameters({"support_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_6 Header - Company - support tab")
    public void case_6(String support_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_6 Header - Company - support tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(1000);
        WebElement tournaments = driver.findElement(By.xpath("//a[@data-test-id=\"support\"]"));
        //tournaments.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", tournaments);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, support_Pg_Url);

        //driver.quit();faq
    }

}
