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

public class Fondo_retiro_tgr2 extends AbsTest {

	@Test
	public void test() throws Exception {
        //carga url
		driver.get("https://test.tesoreria.cl/FondoRetiroExtranetWeb/login.jsp");
	//	driver.manage().window().maximize(); // solo para phantom
		
		
		
		driver.findElement(By.id("j_username")).sendKeys("13086052");
		waitSleep(2);
		driver.findElement(By.id("j_password")).sendKeys("12345678");
		waitSleep(2);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		waitSleep(2);
		driver.findElement(By.xpath("//*[@id=\\\"recaptcha-anchor\\\"]/div[1]")).sendKeys(DatosSistema.getDatoProperties("token"));
		waitSleep(2);
		
		
		
		
		driver.findElement(By.id("btnLogin")).click();
		waitSleep(5);
		
				
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}