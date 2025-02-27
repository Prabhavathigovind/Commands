package Commands;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*
		 * driver.findElement(By.className("dropbtn")).click();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.findElement(By.linkText("Facebook")).click();
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * driver.findElement(By.className("dropbtn")).click(); WebElement opt =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
		 * "Facebook"))); driver.findElement(By.linkText("Facebook")).click();
		 * driver.navigate().back();
		 * driver.findElement(By.className("dropbtn")).click();
		 * 
		 * WebElement opt2 =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
		 * "Flipkart")));
		 * 
		 * driver.findElement(By.linkText("Flipkart")).click();
		 * 
		 * 
		 */
		 
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
          //  driver.findElement(By.xpath("//button[text()='Check this']")).click();	
            
            //wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
            //driver.findElement(By.id("dte")).click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("deletesuccess")));
			driver.findElement(By.id("alert2")).click();
			

		 

		 
		
		
	}

}
