package Main_code;


//import FooterPack.FooterClass;
//import FooterPack.FooterMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static java.time.Duration.ofSeconds;

//@Test(groups = {"mainCode"})
public class MainCode {

    // Инициализируем Webdriver при помощи метода public Static, для автоматического использования в других классах
    public static WebDriver  driver;

    @BeforeMethod
    @Parameters({"preferredBrowser"})
    public void setUp(String preferredBrowser) {

        if(preferredBrowser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        }
        else if(preferredBrowser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        }
    }

    @Parameters({"StartUrlLogin"})
    @Test(groups = {"mainCode"}, testName = "Log in")
    public void mainCode(String StartUrlLogin) throws InterruptedException, IOException, UnsupportedFlavorException {

        System.out.println("*** Header ***");

        // Переход на начальную страницу
        driver.get(StartUrlLogin);

        Thread.sleep(2500);
        // Развертывание страницы на весь экран
        driver.manage().window().maximize();

        try {
            //ofSeconds(6)
            //Ожидаем появление капчи, и в случае когда она появилась решаем ее не более  минут
            WebElement instExchBtn = new WebDriverWait(driver, ofSeconds(6)).until(ExpectedConditions
                    .presenceOfElementLocated(By.xpath("//div[@class='ds-btn ds-btn-primary gray small']")));

        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(2500);
        //Находим и вводи Email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("yanautomte.st.6@gmail.com");

        //Находим и вводим Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Vinnitsa-2022");

        // //Находим и нажимаем клавишу Log in
        Thread.sleep(1500);
        WebElement logBtn = driver.findElement(By.xpath
                ("//button[@type='submit']"));
        logBtn.click();

        Thread.sleep(4500);

        try {
            //Ожидаем появление капчи, и в случае когда она появилась решаем ее не более 3x минут
            WebElement instExchBtn = (new WebDriverWait(driver, ofSeconds(180)))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='close-button']")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        WebElement acceptBtn = driver.findElement(By.xpath("//button[@class='close-button']"));
        acceptBtn.click();
        Thread.sleep(1500);

    }

}

