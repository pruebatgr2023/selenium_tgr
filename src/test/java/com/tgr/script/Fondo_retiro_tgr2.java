package com.tgr.script;

import org.junit.Test;
import org.openqa.selenium.By;
import com.tgr.javaee.propiedades.DatosSistema;
import com.tgr.selenium.abs.AbsTest;

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
