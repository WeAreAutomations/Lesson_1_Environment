package Header.Products;

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

public class Products_Tab_Tests {


    @Parameters({"Staking_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_1 Header - Staking tab")
    public void case_1(String Staking_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_1 Header - Staking tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement marketsBtn = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        marketsBtn.click();

        Thread.sleep(500);
        WebElement spotTrading = driver.findElement(By.xpath("//a[@href=\"/staking\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", spotTrading);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, Staking_Pg_Url);

        //driver.quit();
    }

    @Parameters({"ieo_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_2 Header - ieo tab")
    public void case_2(String ieo_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_2 Header - spotTrading tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(500);
        WebElement spotTrading = driver.findElement(By.xpath("//a[@href=\"/ieo\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", spotTrading);

        Thread.sleep(5500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, ieo_Pg_Url);

        //driver.quit();
    }

    @Parameters({"tournaments_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_3 Header - tournaments tab")
    public void case_3(String tournaments_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_3 Header - tournaments tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        Actions action = new Actions(driver);
        action.moveToElement(tradeTab).perform();

        Thread.sleep(1000);
        WebElement tournaments = driver.findElement(By.xpath("//a[@data-test-id='tournaments']"));
        //tournaments.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", tournaments);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, tournaments_Pg_Url);

        //driver.quit();
    }


}
