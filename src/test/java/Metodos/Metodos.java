package Metodos;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	public static WebDriver driver;

	public void screnShoot(String print) throws IOException {
		
		
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File Desfile = new File(print);
		FileUtils.copyFile(SrcFile, Desfile);
		
		
		
		
		
	}

	public void pausa(int tempo, String descricaopasso) throws InterruptedException {
		  try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now()+ "erro no passo" + descricaopasso);
			
		}
		  
	  }
      
	 public void preencher(By elemento, String texto, String descricaopasso) throws IOException {
		 
		 try {
			 driver.findElement(elemento).sendKeys(texto);
			
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now()+ "erro no passo" + descricaopasso);
			screnShoot(descricaopasso);
		}
		 
	 }
		  
	 public void Click(By elemnto, String descricaopasso) throws IOException {
		 try {
			driver.findElement(elemnto).click();
			
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now()+ "erro no passo" + descricaopasso);
			screnShoot(descricaopasso);
		}
	 }
	public void fecharNavegador(String descricaopasso) throws IOException{
		 try {
			driver.quit();
			
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now()+ "erro no passo" + descricaopasso);
			screnShoot(descricaopasso);
		}
		 
	 }
	public void executarNavegador(String url, String descricaopasso) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	  
	
	
	  
}
