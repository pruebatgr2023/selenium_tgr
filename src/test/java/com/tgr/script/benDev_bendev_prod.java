package com.tgr.script;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;

public class benDev_bendev_prod extends AbsTest {

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
		capturarPantalla(driver, " Paso 01 Ingresa a sitio web");

		// ingresa al menu pagos > impuestos
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		capturarPantalla(driver, "Ingresa menu de sitio web");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		capturarPantalla(driver, "beneficio y devoluciones");

//beneficios
		//Bonificación de Zonas Extremas
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Subsidio Rebaja Tarifa Escolar (Art. 4A)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		// se pasa a la segunda pestaña
		 String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana
		// actual
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // Obten todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cámbiate a la ultima ventana
		waitSleep(2);

		// sigue con la ejecucion en la 2da pestaña
		compara(driver.findElement(By.xpath("/html[1]/body[1]/form[1]/footer[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h4[1]")).getText(), "Servicios de la DTPR");

		//se cambia a la primera pestaña
		driver.switchTo().window(parentWindowHandler);
		waitSleep(2);
		
//insolvencia
		//Solicitar devolución de retenciones por liquidación vigente (liquidadores)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")).click();
		isElementPresent(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/p[2]/strong[1]/span[1]"));
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Solicitar devolución de retenciones por quiebra o liquidación terminada (deudores)
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/p[1]/strong[1]")).getText(), "Persona Natural:");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
//DEVOLUCIONES
		//Solicitud de Devolución Impuesto Verde a Taxistas
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[1]/div[1]/h1[1]/b[1]")).getText(), "Te damos la bienvenida");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Revisar Saldos Disponibles
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText(), "Revisar Saldos Disponibles");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Software Mandato SENCE
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/center[1]")).getText(), "Software Mandato SENCE");
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Registro de Personas Jurídicas
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[4]/a[1]/span[1]")).click();
		compara(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[3]/div[1]/a[1]/label[1]")).getText(), "Ingresa con Clave TGR");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-idp[1]/div[1]/div[4]/div[1]/a[1]/label[1]/strong[1]")).click();
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Devolución IVA Turista
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]/span[1]")).click();
		isElementPresent(By.xpath("/html[1]/body[1]/div[3]/div[1]/h1[1]"));
		// ingresa al menu beneficios y devoluciones > beneficios y devoluciones
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();

		// salida
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}