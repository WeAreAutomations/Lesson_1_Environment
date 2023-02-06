package Header.Language_Tab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static Main_code.MainCode.driver;

public class Language_Tab_Tests {


    @Parameters({"Rus_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_1 Header - Language - Rus tab")
    public void case_1(String Rus_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_1 Header - Language - Rus tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement languageTab = driver.findElement(By.xpath("//div[@data-test-id='lang dropdown']"));
        languageTab.click();

        Thread.sleep(500);
        WebElement ru = driver.findElement(By.xpath("//div[@data-test-id=\"ru\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ru);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, Rus_Pg_Url);
        //driver.quit();
    }

    @Parameters({"tr_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_2 Header - Language - tr tab")
    public void case_2(String tr_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_2 Header - Language - tr tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement languageTab = driver.findElement(By.xpath("//div[@data-test-id='lang dropdown']"));
        languageTab.click();

        Thread.sleep(500);
        WebElement ru = driver.findElement(By.xpath("//div[@data-test-id=\"tr\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ru);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, tr_Pg_Url);
        //driver.quit();
    }

    @Parameters({"esp_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_3 Header - Language - esp tab")
    public void case_3(String esp_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_3 Header - Language - esp tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement languageTab = driver.findElement(By.xpath("//div[@data-test-id='lang dropdown']"));
        languageTab.click();

        Thread.sleep(500);
        WebElement ru = driver.findElement(By.xpath("//div[@data-test-id=\"es\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ru);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, esp_Pg_Url);
        //driver.quit();
    }
    @Parameters({"chi_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_4 Header - Language - chi tab")
    public void case_4(String chi_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_4 Header - Language - chi tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement languageTab = driver.findElement(By.xpath("//div[@data-test-id='lang dropdown']"));
        languageTab.click();

        Thread.sleep(500);
        WebElement ru = driver.findElement(By.xpath("//div[@data-test-id=\"zh\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ru);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, chi_Pg_Url);
        //driver.quit();
    }

    @Parameters({"jap_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_5 Header - Language - jap tab")
    public void case_5(String jap_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_5 Header - Language - jap tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement languageTab = driver.findElement(By.xpath("//div[@data-test-id='lang dropdown']"));
        languageTab.click();

        Thread.sleep(500);
        WebElement ru = driver.findElement(By.xpath("//div[@data-test-id=\"ja\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ru);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, jap_Pg_Url);
        //driver.quit();
    }

    @Parameters({"hi_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_6 Header - Language - hi tab")
    public void case_6(String hi_Pg_Url, String Assert_Test_1) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.out.println(" *** Test_6 Header - Language - hi tab ***");

        Thread.sleep(1000);
        driver.navigate().to(Assert_Test_1);

        Thread.sleep(2500);
        //Находим таб Markets
        WebElement languageTab = driver.findElement(By.xpath("//div[@data-test-id='lang dropdown']"));
        languageTab.click();

        Thread.sleep(500);
        WebElement ru = driver.findElement(By.xpath("//div[@data-test-id=\"hi\"]"));
        //spotTrading.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ru);

        Thread.sleep(3500);
        //Копируем URL текущей страницы
        String GetCurrUrl = driver.getCurrentUrl();
        System.out.println(GetCurrUrl);

        //Добавлен сравнение адреса. При заданых параметрах логина и пароля, адрес страницы меняется
        Assert.assertEquals(GetCurrUrl, hi_Pg_Url);
        //driver.quit();
    }

}
