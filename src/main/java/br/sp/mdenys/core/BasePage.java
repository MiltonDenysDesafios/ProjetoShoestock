package br.sp.mdenys.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	
	/********* Escrever ************/

	public static void write(By by, String texto){
		DriverFactory.getDriver().findElement(by).clear();
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}

	public void write(String id_campo, String texto){
		write(By.id(id_campo), texto);
	}
	
	
	
	/********* Clicar ************/

	public static void click(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	

	/********* Textos ************/
	
	public static String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
		

	public static String replaceString(String nome,String de, String para) {
		String texto = nome;
		String textoCorrigido = texto.replace(de,para);
		return textoCorrigido;
		
	}
	

			
		
	
	
}
