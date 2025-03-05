package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//WebElement element = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		Actions act = new Actions(driver);

	//	act.dragAndDropBy(element, 220, 0).build().perform();
		//act.contextClick(element).build().perform();
		WebElement element = driver.findElement(By.id("testdoubleclick"));
		act.doubleClick(element).build().perform();

	}

}
