package com.tgr.script;

import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import com.tgr.javaee.propiedades.DatosSistema;
import com.tgr.selenium.abs.AbsTest;


public class apoyo_egresos_tgr extends AbsTest {

	@Test
	public void test() throws Exception {

		
		driver.get("about:blank");
		driver.manage().deleteAllCookies();
		driver.get(urlApp);
		((JavascriptExecutor) driver).executeScript("localStorage.clear();");
		driver.get(urlApp);
		driver.manage().window().maximize(); // solo para phantom
	
			
		capturarPantalla(driver, " Paso 00 " + "Ingresa a sitio web");
		//driver.switchTo().frame(0);
		
		driver.findElement(By.id("intra_username")).sendKeys(DatosSistema.getDatoProperties("Cliente"));
		waitSleep(2);

		driver.findElement(By.id("textfield2")).sendKeys(DatosSistema.getDatoProperties("clave"));
		driver.findElement(By.id("btn1")).click();
		waitSleep(2);
		capturarPantalla(driver, " Paso 1 " + "realiza Login");
				
		
		//entra en apoyosistema egreso
		driver.findElement(By.xpath("//a[contains(text(),'Apoyo Sistemas Egresos')]")).click();
		waitSleep(2); 
		
		
		
		//selecciiona otra pestaña
		
		
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // Obten todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cámbiate a la ultima ventana

		//driver.get(urlApp);
		
		waitSleep(5);
		
		//administrar egresos cut
		capturarPantalla(driver, " casa bobo");
		driver.findElement(By.xpath("//body/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
		waitSleep(2);               
		//consulta 
		driver.findElement(By.xpath("//a[contains(text(),'Consulta Procesos')]")).click();
		waitSleep(2);
		//inresa fecha inicio
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionDesde")).sendKeys(DatosSistema.getDatoProperties("fecha1"));
		driver.findElement(By.xpath("//body[1]/div[7]/div[1]/table[1]/tbody[1]/tr[1]/td[7]")).click();
		waitSleep(2);
		//ingresa fecha hasta
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fechaCreacionHasta")).sendKeys(DatosSistema.getDatoProperties("fecha2"));
		driver.findElement(By.xpath("//tbody/tr[6]/td[2]")).click();
		waitSleep(2);
		
		//ingresa numero de proceso
		driver.findElement(By.id("idProceso")).sendKeys(DatosSistema.getDatoProperties("NProceso"));
		waitSleep(2);
        //presiona buscar
		driver.findElement(By.id("btnBuscar")).click();
		waitSleep(5);
		//valida resutado de busqueda
		srollElement("//body/div[@id='content']/div[1]/div[3]/div[1]/div[1]");	
		driver.findElement(By.xpath("//td[contains(text(),'15723')]")).isEnabled();
		waitSleep(2);
				
		    driver.manage().deleteAllCookies();
		    driver.close();
		    driver.quit();
		    
		}
		


	}
			
		