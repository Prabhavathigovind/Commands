package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Morecommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String height = driver.findElement(By.id("but2")).getCssValue("line-height");
		System.out.println(height);
		
		String name = driver.getClass().getSimpleName();
		System.out.println(name);
	}

}
