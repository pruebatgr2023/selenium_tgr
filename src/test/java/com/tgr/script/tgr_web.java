package com.tgr.script;


import org.junit.Test;
import org.openqa.selenium.Dimension;
import com.tgr.selenium.abs.AbsTest;

public class tgr_web extends AbsTest {

	@Test
	public void test() throws Exception {
        //carga url
		driver.get("https://www.tgr.cl/");
		maximizarventana(driver); 
		waitSleep(5);

		Dimension dimension = new Dimension(1280, 920);
		driver.manage().window().setSize(dimension);

		capturarPantalla(driver,"carga tgr");
		
		
				
		driver.manage().deleteAllCookies();
	    driver.quit();

	}

}
