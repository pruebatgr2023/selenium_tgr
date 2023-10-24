package com.tgr.selenium.abs;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
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
import com.tgr.javaee.propiedades.DatosSistema;

public class AbsTest {

	private static final Logger LOGGER = Logger.getLogger(AbsTest.class);
	private static final String EXTENSION_IMAGEN = ".png";

	protected WebDriver driver;
	protected String urlApp;
	protected boolean acceptNextAlert = true;
	protected StringBuffer verificationErrors = new StringBuffer();
	protected int hora;
	protected int fecha;

	@Before
	public void setUp() throws Exception {
		Calendar calendario = new GregorianCalendar();
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		fecha = calendario.get(Calendar.DATE);

		LOGGER.info("INICIANDO @BEFORE setUp():" + this.getClass().getName());
		String operationSystem = System.getProperty("os.name").toLowerCase();
		if (operationSystem.indexOf("win") >= 0) {
			LOGGER.info("setUp():ES WINDOWS");

			// chrome windows
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Runners/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();		
			driver = new ChromeDriver(options);
			
		} else if (operationSystem.indexOf("nix") >= 0 || operationSystem.indexOf("nux") >= 0
				|| operationSystem.indexOf("aix") > 0) {
			LOGGER.info("setUp():ES LINUX");

				//chrome linux

				// Configura el controlador de Chrome para Linux
				System.setProperty("webdriver.chrome.driver", "./src/main/resources/Runners/linux64/chromedriver");
				this.driver = new ChromeDriver(); // Asigna el valor al miembro de la clase
				urlApp = DatosSistema.getDatoProperties("url");
			
		} else {
			throw new Exception("Error al setear el Sistema operativo");
		}
	}

	@After
	public void tearDown() throws Exception {
		LOGGER.info("INICIANDO @AFTER tearDown():" + this.getClass().getName());
		if (driver != null) {
			driver.quit();
		} else {
			LOGGER.warn("WebDriver is already null. Cannot quit.");
		}
	}
	

	public void closeBrowser() {
        // Compruebe si el controlador no es nulo antes de invocar cualquier método en él
        if (driver != null) {
            // Sale del WebDriver cuando haya terminado
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
		LOGGER.info("INICIO -----> ESPERA:" + second + " / SEGUNDOS");
		long millis = second * 1000;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LOGGER.info("FIN    -----> ESPERA:" + second + " / SEGUNDOS");
	}

	protected void capturarPantalla(WebDriver driver, String nombreImagen) throws IOException {
		LOGGER.info("Captura de pantalla URL: " + driver.getCurrentUrl() + " - Nombre imagen: " + nombreImagen
				+ EXTENSION_IMAGEN);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshots/" + nombreImagen + EXTENSION_IMAGEN));
	}

	/**
	 * @param driver
	 */
	public void maximizarventana(WebDriver driver) {
		try {
			driver.manage().window().maximize();
			System.out.println("ventana de navegador maximizada");
		} catch (WebDriverException e) {
			System.out.println("Error ventana  maximizada");
		}
	}

	public void Disabled(String xpath) {
		WebElement yourButton = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", yourButton);
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')", yourButton);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(yourButton));
		yourButton.click();
	}

	public void srollElement(String xpath) {
		WebElement yourButton = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", yourButton);
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')", yourButton);
		WebDriverWait wait = new WebDriverWait(driver, 20);
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

	// Compara texto primer texto corresponde a UTF
	protected void compara(String texto1, String texto2) {
		try {
			// String textoUTF = cambiaTexto(texto1);
			// assertEquals(textoUTF, texto2);
			assertEquals(texto1, texto2);
		} catch (Exception e) {
			LOGGER.error("compara(), exception,", e);
		}
	}

	public void button(String xpath) {
		driver.switchTo().activeElement();
		WebElement yourButton = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('type','submit')", yourButton);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(yourButton));
		yourButton.click();
	}

	// scrool abajo
	public void scroll() throws IOException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// capturarPantalla(driver, "sroll " + hora);
	}

	// scrool arriba
	public void scrollUp() throws IOException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0 )");
		// capturarPantalla(driver, "sroll " + hora);

		Calendar calendario = new GregorianCalendar();
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		fecha = calendario.get(Calendar.DATE);

	}
 }
