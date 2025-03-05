package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionscommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    Actions act = new Actions(driver);
		/*
		 * WebElement element = driver.findElement(By.id("blogsmenu"));
		 * act.moveToElement(element).build().perform();
		 */
	    
	      WebElement element = driver.findElement(By.id("checkbox2"));
	      act.moveToElement(element).click().build().perform();

	}

}
