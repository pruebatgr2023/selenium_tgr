package com.tgr.script;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;


public class Prueba_web_menu_pagos_3_tgr extends AbsTest {

	/**
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {

		//carga url
		driver.get("https://www.tgr.cl");
		//configura tamaño de la pantalla
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);

		waitSleep(3);
		capturarPantalla(driver, " Paso 01 " + "Ingresa a sitio web");

		//ingresa al menu pagos > multas, patentes y otros
		driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		capturarPantalla(driver, "Ingresa menu de sitio web");
        driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();
        capturarPantalla(driver, "Ingresa menu multas patentes y otros");
		
		//MULTAS

		//valida si existe opcion de menu multa mercado financiero
		isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"));
        //valida si existe menu multas de sernac
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"));
        //valida si existe menu multas de fonasa
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"));
        //valida si existe menu patentes derechos de agua
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"));
        //valida si existe menu oferta economica casino
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"));
		//valida si existe menu tribunal de cuenta
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"));
		//valida si existe menu notario y martillero
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[7]/a[1]/span[1]"));
        //valida si existe menu patentes mineras
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[8]/a[1]/span[1]"));
		//valida si existe menu multas casino
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[9]/a[1]/span[1]"));
	    //valida si existe menu multas juzgado
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[10]/a[1]/span[1]"));
		//valida si existe menu multas subtel
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[11]/a[1]/span[1]"));
		//valida si existe menu multas ley transparecia
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[12]/a[1]/span[1]"));
		//valida si existe menu multas aplicadas por servicio publico
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[13]/a[1]/span[1]"));




		//OTROS PAGOS

		//valida si existe menu pagar cuotas Ex Cora
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"));
		//valida si existe menu cuotas credito fiscal
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]"));
        //valida si existe menu consignar deudas morosas
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
		//valida si existe menu arrendamiento de pedidos
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[4]/a[1]/span[1]"));
		//valida si existe menu pagar moneda extranjera
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[5]/a[1]/span[1]"));


		//DECLARACION DE PAGO SIMULTANEO

        //valida si existe menu SUBSIDIO LEY 20.378
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
		//valida si existe menu SERNAPESTA
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        //valida si existe menu CONCESIONES MARITIMAS
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[3]/a[1]/span[1]"));
		//valida si existe menu REINTEGRO DE INTITUCIONES
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[11]/a[1]/span[1]"));
		//valida si existe menu RECAUDACION FONDE DE ESTABILIZACION DE TARIFAS ELECTRICAS LEY 21.472
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[12]/a[1]/span[1]"));
		//valida si existe menu VER TODOS LOS PAGOS CON DECLARACION
        isElementPresent(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[13]/a[1]/span[1]"));

		//salida
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}
