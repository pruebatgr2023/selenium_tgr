package com.tgr.selenium.abs;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tgr.javaee.propiedades.DatosSistema;

public class AbsTest {

    private static final String EXTENSION_IMAGEN = ".png";

    protected WebDriver driver;
    protected String urlApp;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();
    protected int hora;
    protected int fecha;

    @BeforeMethod
    public void setUp() throws Exception {
        Calendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        fecha = calendario.get(Calendar.DATE);

        String operationSystem = System.getProperty("os.name").toLowerCase();
        if (operationSystem.indexOf("win") >= 0) {
            // chrome windows
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/Runners/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();        
            driver = new ChromeDriver(options);

        } else if (operationSystem.indexOf("nix") >= 0 || operationSystem.indexOf("nux") >= 0
                || operationSystem.indexOf("aix") > 0) {
            // chrome linux
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/Runners/linux64/chromedriver");
            this.driver = new ChromeDriver();
            urlApp = DatosSistema.getDatoProperties("url");

        } else {
            throw new Exception("Error al setear el Sistema operativo");
        }
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("WebDriver is already null. Cannot quit.");
        }
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("WebDriver is already null. Cannot quit.");
        }
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected void waitSleep(int second) {
        long millis = second * 1000L;
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void capturarPantalla(WebDriver driver, String nombreImagen) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./screenshots/" + nombreImagen + EXTENSION_IMAGEN));
    }

    public void maximizarventana(WebDriver driver) {
        try {
            driver.manage().window().maximize();
            System.out.println("ventana de navegador maximizada");
        } catch (WebDriverException e) {
            System.out.println("Error ventana maximizada");
        }
    }

    public void Disabled(String xpath) {
        WebElement yourButton = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", yourButton);
        js.executeScript("arguments[0].removeAttribute('disabled','disabled')", yourButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(yourButton));
        yourButton.click();
    }

    public void srollElement(String xpath) {
        WebElement yourButton = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", yourButton);
        js.executeScript("arguments[0].removeAttribute('disabled','disabled')", yourButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(yourButton));
    }

    public void radio(String xpath) {
        WebElement yourButton = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('checked','checked')", yourButton);
        js.executeScript("arguments[0].setAttribute('display','block')", yourButton);
        js.executeScript("arguments[0].setAttribute('disabled','true')", yourButton);
        js.executeScript("arguments[0].setAttribute('checked','true')", yourButton);
        js.executeScript("arguments[0].setAttribute('checked', 'checked')", yourButton);
    }

    protected void compara(String texto1, String texto2) {
        try {
            assertEquals(texto1, texto2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void button(String xpath) {
        driver.switchTo().activeElement();
        WebElement yourButton = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('type','submit')", yourButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(yourButton));
        yourButton.click();
    }

    public void scroll() throws IOException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollUp() throws IOException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

        Calendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        fecha = calendario.get(Calendar.DATE);
    }
}