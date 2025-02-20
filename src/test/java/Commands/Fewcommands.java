package Commands;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fewcommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		@Nullable
	//	String source = driver.getPageSource()	;	
		//System.out.println(source);
		
		String name = driver.findElement(By.className("classone")).getTagName();
		System.out.println(name);
		
		Dimension names = driver.findElement(By.className("classone")).getSize();
		System.out.println(names);
		

		Point loc = driver.findElement(By.className("classone")).getLocation();
		System.out.println(loc);
		
		List<WebElement> buttons = driver.findElements(By.xpath("//button"));
		for (WebElement elements : buttons)
		{
			System.out.println(elements.getText());
		}
		System.out.println(buttons);

	}

	
}
