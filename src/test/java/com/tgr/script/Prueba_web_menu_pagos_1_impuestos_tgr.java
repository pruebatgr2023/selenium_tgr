package com.tgr.script;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;


public class Prueba_web_menu_pagos_1_impuestos_tgr extends AbsTest {

	/**
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {

		//((JavascriptExecutor) driver).executeScript("localStorage.clear();");
		driver.get("https://www.tgr.cl");
		//driver.manage().window().maximize(); // solo para phantom
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);

		waitSleep(3);
		capturarPantalla(driver, " Paso 01 " + "Ingresa a sitio web");

		//ingresa al menu pagos > multas, patentes y otros
		driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		capturarPantalla(driver, "Ingresa menu de sitio web");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        capturarPantalla(driver, "pagos de impuestos");
		
//contribuciones
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        waitSleep(3);
		//valida texto contribuciones
		isElementPresent(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
        waitSleep(5);
		capturarPantalla(driver, "contribuciones");
		//vuelve a seleccionar menu
		driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")).click();

	//salida
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}        
