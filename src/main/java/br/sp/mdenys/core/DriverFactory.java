package br.sp.mdenys.core;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class DriverFactory {

	private static WebDriver driver;

	public static WebDriver getDriver(){
		
		
		try {
			if (driver == null) {
				switch (Propriedades.browser) {
				case FIREFOX:
					driver = new FirefoxDriver();
					break;
				case CHROME:		
					driver = new ChromeDriver();
					System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");	

					break;
				}
				driver.manage().window().maximize();
				
			}
		}catch(Exception e){
			
			
		}
		
		
		return driver;

		
	
	}

	public static void killDriver() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
}
