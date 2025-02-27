package Commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		Iterator<String> itr = handles.iterator();
		while(itr.hasNext())
		{
			String window = itr.next();
			driver.switchTo().window(window);
			if(driver.getTitle().equals("Basic Web Page Title"))
			{
				driver.close();
			}
		}
		driver.switchTo().window(handle);
		driver.findElement(By.name("q")).sendKeys("prabha");
	

	}

}
