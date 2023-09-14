package com.tgr.script;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.tgr.javaee.propiedades.DatosSistema;
import com.tgr.selenium.abs.AbsTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class Prueba_web_tgr extends AbsTest {

	@Test
	public void test() throws Exception {

		//((JavascriptExecutor) driver).executeScript("localStorage.clear();");
		driver.get("www.google.cl");
		//driver.manage().window().maximize(); // solo para phantom
		waitSleep(3);
		capturarPantalla(driver, "prueba");
		
		
				
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}
