package com.tgr.script;

import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import com.tgr.javaee.propiedades.DatosSistema;
import com.tgr.selenium.abs.AbsTest;


public class elimina_retenciones_tgr extends AbsTest {

	@Test
	public void test() throws Exception {

		
		driver.get(urlApp);
		//configura tamaño de la pantalla
		Dimension dimension = new Dimension(1280, 920);
		driver.manage().window().setSize(dimension);
	
			
		capturarPantalla(driver, "ingresa a sietma de gestion con usuario GvegaT");
		//driver.switchTo().frame(0);
		
		driver.findElement(By.id("intra_username")).sendKeys(DatosSistema.getDatoProperties("Cliente"));
		waitSleep(2);

		driver.findElement(By.id("textfield2")).sendKeys(DatosSistema.getDatoProperties("clave"));
		driver.findElement(By.id("btn1")).click();
		waitSleep(2);
		capturarPantalla(driver, " Paso 1 realiza Login");
				
		
		//entra retencion y compensaciones 8.1
		driver.findElement(By.xpath("//a[contains(text(),'Retenciones y Compensaciones (8.1)')]")).click();
		waitSleep(2); 
		
		
		
		//selecciona otra pestaña
		
		
		//String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // Obten todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cámbiate a la ultima ventana
		waitSleep(2);
		
		
		//sigue con la ejecucion en la 2da pestaña
		capturarPantalla(driver, "abre retencion y compensaciones");
		driver.switchTo().frame("frameLeft");
		//retencion
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/a")).click();
		waitSleep(2);               
		//modifica / elimina  RET
		driver.findElement(By.xpath("//a[contains(text(),'Modificar / Eliminar')]")).click();
		waitSleep(3);
		
		//cambio de Frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameRight");
		//ingresa rut
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("14360701");
		waitSleep(2);
		//ingresa DV
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[2]")).sendKeys("1");
		waitSleep(2);
		//selecciona combobox tipo retencion
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).click();
		waitSleep(2);
		//selecciona tipo retencion (Mandato)
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).sendKeys(Keys.ENTER);
		waitSleep(2);
		//selecciona sub-tipo RET (normal)
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.subTipoRetencion}']")).click();
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.subTipoRetencion}']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.subTipoRetencion}']")).sendKeys(Keys.ENTER);
		waitSleep(2);
		capturarPantalla(driver, "ingresa tipo retencion");
		//boton continuar
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[6]/tbody[1]/tr[1]/td[1]/div[1]/input[2]")).click();
		waitSleep(3);
		//boton continuar (toma la primera que esta seleccionada)
		driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[9]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
		waitSleep(3);
		//ingresa OBS
		driver.findElement(By.xpath("//tbody/tr[14]/td[3]/textarea[1]")).sendKeys("Eliminacion por Prueba Automatizada");
		waitSleep(2);
		capturarPantalla(driver, "ingresa datos retencion");
		//boton continuar
		driver.findElement(By.xpath("//input[@id='btn']")).click();
		waitSleep(3);	
		//selecciona direccion envio
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")).sendKeys(Keys.ENTER);
		waitSleep(2);
		//boton continuar
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/input[1]")).click();
		waitSleep(3);
		//boton continuar (confirmar datos)
		capturarPantalla(driver, "confirma retencion eliminada");
		driver.findElement(By.xpath("//input[@id='btn']")).click();
		waitSleep(3);

	    driver.manage().deleteAllCookies();
	    driver.close();
	    driver.quit();
		    
		}
		


	}
			
		
