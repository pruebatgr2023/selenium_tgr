package com.tgr.script;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;

public class tgr_web_prod extends AbsTest {

	@Test
	public void test() throws Exception {
		// carga url
		driver.get("https://www.tgr.cl/");
		maximizarventana(driver);
		waitSleep(5);

		Dimension dimension = new Dimension(1280, 920);
		driver.manage().window().setSize(dimension);

		capturarPantalla(driver, "carga tgr");

		closeBrowser();

	}

}
