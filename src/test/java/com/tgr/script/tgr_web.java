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
import org.openqa.selenium.Dimension;
import com.tgr.javaee.propiedades.DatosSistema;
import com.tgr.selenium.abs.AbsTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class tgr_web extends AbsTest {

	@Test
	public void test() throws Exception {
        //carga url
		driver.get("https://www.tgr.cl/");
		maximizarventana(driver); 
		waitSleep(5);

		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);

		capturarPantalla(driver,"carga tgr");
		
		
				
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}
