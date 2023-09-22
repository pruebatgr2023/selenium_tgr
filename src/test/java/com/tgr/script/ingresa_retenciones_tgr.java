package com.tgr.script;

import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import com.tgr.javaee.propiedades.DatosSistema;
import com.tgr.selenium.abs.AbsTest;


public class ingresa_retenciones_tgr extends AbsTest {

	@Test
	public void test() throws Exception {

		driver.get(urlApp);
		//configura tamaño de la pantalla
		Dimension dimension = new Dimension(1280, 920);
		driver.manage().window().setSize(dimension);
	
	
			
		capturarPantalla(driver,"paso 1 Ingresa a sistema gestion");
		//driver.switchTo().frame(0);
		
		driver.findElement(By.id("intra_username")).sendKeys(DatosSistema.getDatoProperties("Cliente"));
		waitSleep(2);

		driver.findElement(By.id("textfield2")).sendKeys(DatosSistema.getDatoProperties("clave"));
		driver.findElement(By.id("btn1")).click();
		waitSleep(2);
		capturarPantalla(driver, "paso 2 " + "realiza Login");
				
		
		//entra retencion y compensaciones 8.1
		driver.findElement(By.xpath("//a[contains(text(),'Retenciones y Compensaciones (8.1)')]")).click();
		waitSleep(2); 
		capturarPantalla(driver,"paso 3 Retenciones y Compensaciones");
		
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
		driver.switchTo().frame("frameLeft");
		//retencion
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/a")).click();
		waitSleep(2);               
		//agregar RET
		driver.findElement(By.xpath("//tbody/tr[4]/td[4]/a[1]")).click();
		waitSleep(3);
		capturarPantalla(driver,"paso 4 Retenciones y Compensaciones menu");
		//ingresa rut y dv
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameRight");
		driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr[1]/td[3]/input[1]")).sendKeys("14360701");
		waitSleep(2);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[2]")).sendKeys("1");
		waitSleep(2);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).click();
		waitSleep(2);
		capturarPantalla(driver," paso 5 Retenciones y Compensaciones rut");
		//selecciona tipo retencion (Mandato)
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.tipoRetencion}']")).sendKeys(Keys.ENTER);
		waitSleep(2);
		capturarPantalla(driver,"paso 6 Retenciones y Compensaciones mandato");
		//selecciona sub-tipo RET (normal)
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.subtipoRetencion}']")).click();
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.subtipoRetencion}']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='wlw-select_key:{actionForm.subtipoRetencion}']")).sendKeys(Keys.ENTER);
		waitSleep(2);
		capturarPantalla(driver,"paso 7 Retenciones y Compensaciones normal");
		//boton ingresar
		driver.findElement(By.xpath("//input[@id='btn']")).click();
		waitSleep(3);
		
		                            // se completa formulario
		
		//se ingresa numero de oficio
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[5]/td[3]/input")).sendKeys("1234");
		waitSleep(2);
		capturarPantalla(driver,"paso 8 Retenciones y Compensaciones formulario");
		//se completa fecha
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[5]/td[5]/input[1]")).sendKeys("01");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[5]/td[5]/input[2]")).sendKeys("01");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[5]/td[5]/input[3]")).sendKeys("2023");
		waitSleep(2);
		capturarPantalla(driver,"paso 8 Retenciones y Compensaciones fecha");
		//se selecciona chekbox todos
		driver.findElement(By.id("wlw-checkbox_key:{actionForm.todosEgresos}")).click();
		waitSleep(2);
		capturarPantalla(driver,"paso 9 Retenciones y Compensaciones check box nuevo");
		//se ingresa monto a retener
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[1]/td[3]/input[1]")).sendKeys("1000000");
		waitSleep(2);
		capturarPantalla(driver,"paso 10 Retenciones y Compensaciones monto retener");
		//se selcciona tipo moneda
		driver.findElement(By.id("wlw-select_key:{actionForm.moneda}")).click();
		driver.findElement(By.id("wlw-select_key:{actionForm.moneda}")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("wlw-select_key:{actionForm.moneda}")).sendKeys(Keys.ENTER);
		waitSleep(2);
		capturarPantalla(driver," paso 11 Retenciones y Compensaciones ingreso moneda");
		//selecciona medio de pago
		driver.findElement(By.id("wlw-select_key:{actionForm.tipoPago}")).click();
		driver.findElement(By.id("wlw-select_key:{actionForm.tipoPago}")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("wlw-select_key:{actionForm.tipoPago}")).sendKeys(Keys.ENTER);
		waitSleep(2);
		capturarPantalla(driver,"paso 12 Retenciones y Compensaciones ingreso medio de pago");
		//fecha mandato 
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[5]/td[3]/input[1]")).sendKeys("01");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[5]/td[3]/input[2]")).sendKeys("01");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[5]/td[3]/input[3]")).sendKeys("2023");
		waitSleep(2);
		capturarPantalla(driver,"paso 13 Retenciones y Compensaciones fecha mandato");
		//rut mandatario
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[6]/td[3]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[6]/td[3]/input[2]")).sendKeys("9");
		waitSleep(2);
		capturarPantalla(driver,"paso 14 Retenciones y Compensaciones rut mandatario");
		//ingresa OBS
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/div/table[1]/tbody/tr[7]/td[3]/textarea")).sendKeys("Prueba Automatizada");
		waitSleep(2);
		capturarPantalla(driver,"paso 15 Retenciones y Compensaciones ingresa OBS");
		//presiona boton continuar
		driver.findElement(By.id("btn")).click();
		waitSleep(2);
		//selecciona direccion envio
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[8]/td[3]/table[1]/tbody/tr/td[2]/select")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[8]/td[3]/table[1]/tbody/tr/td[2]/select")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[3]/tbody/tr[8]/td[3]/table[1]/tbody/tr/td[2]/select")).sendKeys(Keys.ENTER);
		waitSleep(2); //carga pagina de conformar datos
		capturarPantalla(driver,"paso 16 Retenciones y Compensaciones confirmar datos");
		//selecciona btn continuar
		driver.findElement(By.xpath("//*[@id=\"Netui_Form_0\"]/table[6]/tbody/tr/td/div/input[1]")).click();
		waitSleep(2);
		capturarPantalla(driver,"paso 17 Retenciones y Compensaciones continuar");
		//confirma datos
		driver.findElement(By.id("btn")).click();
		waitSleep(2);
		capturarPantalla(driver,"paso 18 Retenciones y Compensaciones confirma datos");
		//valida mensaje de operacion exitosa
		compara(driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td")).getText(),"TRANSACCION EXITOSA");
		waitSleep(2);
		capturarPantalla(driver,"paso 19 Retenciones y Compensaciones operacion exitosa");
		
		
		    driver.manage().deleteAllCookies();
		    driver.close();
		    driver.quit();
		    
		}
		


	}
			
		
