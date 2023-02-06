package Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static Main_code.MainCode.driver;

public class Header_Tests {


    @Parameters({"Markets_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_1 Header - Markets tab")
    public void case_1(String Markets_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_1 Header - Markets tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement marketsBtn = driver.findElement(By.xpath("//span[contains(text(),'Markets')]"));
        marketsBtn.click();

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, Markets_Pg_Url);

        //driver.quit();
    }

    @Parameters({"FreeCoins_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_2 Header - FreeCoins")
    public void case_2(String FreeCoins_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_2 Header - FreeCoins tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//span[contains(text(),'Free coins')]"));
        tradeTab.click();

        Thread.sleep(4500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, FreeCoins_Pg_Url);
        //driver.quit();
    }

    @Parameters({"Wallet_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_3 Header - Wallet")
    public void case_3(String Wallet_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_3 Header - Wallet tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//a[@data-test-id=\"wallet\"]"));
        tradeTab.click();

        Thread.sleep(4500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, Wallet_Pg_Url);
        //driver.quit();
    }

    @Parameters({"orders_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_4 Header - orders")
    public void case_4(String orders_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_4 Header - orders tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб tradeTab
        WebElement tradeTab = driver.findElement(By.xpath("//a[@data-test-id=\"orders\"]"));
        tradeTab.click();

        Thread.sleep(4500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, orders_Pg_Url);
        //driver.quit();
    }

}
