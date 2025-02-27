package Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		/*
		 * WebElement dropdown = driver.findElement(By.id("drop1"));
		 * org.openqa.selenium.support.ui.Select select = new
		 * org.openqa.selenium.support.ui.Select(dropdown);
		 * select.selectByVisibleText("doc 1");
		 */
		Thread.sleep(1000);
		//WebElement dropmultiset = driver.findElement(By.id("multiselect1"));
	//	org.openqa.selenium.support.ui.Select newselect = new org.openqa.selenium.support.ui.Select(dropmultiset);
	//	newselect.selectByVisibleText("Audi");
		//newselect.selectByValue("volvox");
		//newselect.selectByIndex(1);
		
		WebElement multiset = driver.findElement(By.id("multiselect1"));
		org.openqa.selenium.support.ui.Select newselect = new org.openqa.selenium.support.ui.Select(multiset);
		System.out.println(newselect.isMultiple());
		newselect.selectByIndex(2);
		Thread.sleep(1000);

		newselect.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		newselect.deselectByIndex(2);
		
		//newselect.deselectAll();
		

		//WebElement choices = newselect.getFirstSelectedOption();
		//List<WebElement> choices = newselect.getAllSelectedOptions();

	//	System.out.println(choices);
		/*
		 * List<WebElement> options = newselect.getOptions();
		 * 
		 * for (WebElement opt:options) { System.out.println(opt.getText()); }
		 */

		
		


		
		
		
	
		
		

	}

}
