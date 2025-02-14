package Commands;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	//	driver.manage().window().fullscreen();
		
		//Dimension d = new Dimension(300,500);//not working
	//	driver.manage().window().setSize(d);//
		
	driver.findElement(By.id("ta1")).sendKeys("hello");
		//driver.findElement(By.id("alert1")).click();
		driver.findElement(By.linkText("compendiumdev")).click();
	
		
		

	}

}
