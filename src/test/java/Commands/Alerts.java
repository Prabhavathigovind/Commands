package Commands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	//	Thread.sleep(1000);
	/*
	 * driver.findElement(By.id("alert1")).click(); Alert alert =
	 * driver.switchTo().alert(); String text = alert.getText();
	 * System.out.println(text); alert.accept();
	 */

	/*
	 * driver.findElement(By.id("alert1")).click(); WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(20));
	 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
	 * driver.switchTo().alert(); alert.accept();
	 */
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("hello");
		
	}

}
