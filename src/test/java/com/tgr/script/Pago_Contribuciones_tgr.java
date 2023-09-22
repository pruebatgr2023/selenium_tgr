package com.tgr.script;

import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;

public class Pago_Contribuciones_tgr extends AbsTest {

	@Test
	public void test() throws Exception {
        
		//llama la url
		driver.get("https://www.tgr.cl");
		//configura tamaño de la pantalla
		Dimension dimension = new Dimension(1280, 920);
		driver.manage().window().setSize(dimension);
		
		
		waitSleep(3);
		capturarPantalla(driver,"paso 1 Ingresa a sitio web tgr");

		//ingresa al menu pagos > pago impuestos
		driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		capturarPantalla(driver, "paso 2 Ingresa menu de sitio web");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        capturarPantalla(driver, "paso 3 pagos de impuestos");
		
        //contribuciones
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        waitSleep(3);
		//valida texto contribuciones
		isElementPresent(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
        waitSleep(5);
		capturarPantalla(driver, "paso 4 contribuciones");
        
		//ingresa a pagar sin clave
		srollElement("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]");
		waitSleep(2);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]")).click();

		//selecciona otra pestaña
	//	String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // Obten todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cámbia a la ultima ventana

        
        //trabaja en la 2da pestaña
		isElementPresent(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/mdl-layout[1]/div[1]/div[1]/mdl-layout-content[1]/app-agregar[1]/app-agregar-nueva[1]/div[1]/div[1]/h5[1]"));
        waitSleep(2);
		capturarPantalla(driver, "paso 5 pagina buscar propiedades");

		//ingresa a pantalla busca propiedades
		
        isElementPresent(By.xpath("/html/body/app-root/app-main/mdl-layout/div/div/mdl-layout-content/app-agregar/app-agregar-nueva/div[1]/div/h5"));
        capturarPantalla(driver, "paso 6 ingresa a pantalla busca propiedades");
		
		
		//salida
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}
