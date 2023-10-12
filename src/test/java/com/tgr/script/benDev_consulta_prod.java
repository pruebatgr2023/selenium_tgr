package com.tgr.script;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;

public class benDev_consulta_prod extends AbsTest {

	/**
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {

		// carga la url
		driver.get("https://www.tgr.cl");
		// configura el tamaño de la pantalla
		Dimension dimension = new Dimension(1280, 920);
		driver.manage().window().setSize(dimension);

		waitSleep(3);
		// ingresa al menu beneficios y deboluciones> consultas
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();

//beneficios
		//Subsidio Ingreso Mínimo Mipymes​
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		isElementPresent(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
		
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Bonos y Anticipo a las MYPE Ley 21.354
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText(), "Bonos y Anticipo a las Micro y Pequeñas Empresas");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Préstamo Clase Media
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]")).getText(), "Préstamo Solidario Clase Media");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Bono Clase Media
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")).getText(), "Bono Clase Media 2021");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Beneficios Trabajadores Independientes
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
		waitSleep(5);
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Beneficio Trabajadores Portuarios Eventuales
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[7]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[2]/div[1]/a[1]/b[1]")).getText(), "¿Por qué preferir estas claves?");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Bono Vocal de Mesa
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[8]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText(), "Bono Vocal de Mesa");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Bonificación Forestal y Bosque Nativo
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[9]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Bonificación APV Ley 3.500
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[10]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Comisión Nacional de Riego CNR, SUBPESCA y Portuarios
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[11]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Subsidio Transporte Adulto Mayor Ley 21.192 (Nuevo)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[12]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText(), "SUBSIDIO TRANSPORTE ADULTO MAYOR");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Remanente de IVA Crédito (Nuevo)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[13]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Ver todos los Pagos Emitidos por el Estado
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[14]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]")).getText(), "Revisa los beneficios y devoluciones que has recibido desde el Estado, por ejemplo el Bono Vocal de Mesa, Bono Clase Media, entre otros.");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
//DEVOLUCIONES
		//Solicitar el estado de la devolución del Impuesto Verde a taxistas (Ley 20.780)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Deudas Compensadas
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Retenciones Crédito Universitario
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Estado Reintegro Leyes 18.708-19.240
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[4]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Consulta Renta
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText(), "Consulta Renta");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Devolución Pagos Sence
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[7]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Estado de Devolución Bonificación TNE (Ley 20.696)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[8]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText(), "Bonificación TNE Ley 20.696");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Fomento Empleo Ley 20.330
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[9]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Financiamiento Público Electoral
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[10]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText(), "Financiamiento Público Electoral");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Devolución Contribuciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[11]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Otras Devoluciones de IVA
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[12]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Otras Devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[13]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		//Consultar Devoluciones No Cobradas
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[14]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		
		// salida
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}