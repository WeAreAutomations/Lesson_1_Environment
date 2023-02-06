package Header.Trade_Tab;

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

public class Trade_Tab_Tests {


    @Parameters({"spotTrading_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_2 Header - spotTrading tab")
    public void case_2(String spotTrading_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_2 Header - spotTrading tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Trade')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(500);
        WebElement spotTrading = driver.findElement(By.xpath("//a[@href=\"/spot/trading\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", spotTrading);

        Thread.sleep(6500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, spotTrading_Pg_Url);

        //driver.quit();
    }

    @Parameters({"DemoTrading_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_3 Header - Demo Trading tab")
    public void case_3(String DemoTrading_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_3 Header - Demo Trading tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Trade')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(500);
        WebElement DemoTrading = driver.findElement(By.xpath("//a[@href=\"/demo-trade\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", DemoTrading);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, DemoTrading_Pg_Url);

        //driver.quit();
    }

    @Parameters({"quickExchange_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_4 Header - quickExchange tab")
    public void case_4(String quickExchange_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_4 Header - quickExchange tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Trade')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(500);
        WebElement DemoTrading = driver.findElement(By.xpath("//a[@href=\"/quick-exchange\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", DemoTrading);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, quickExchange_Pg_Url);

        //driver.quit();

    }

}
