package Commands;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Otherbasics {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File image = driver.findElement(By.id("ta1")).getScreenshotAs(OutputType.FILE);
		Files.copy(image, new File(System.getProperty("user.dir")+"\\Screesnshotsss.png"));
		
		
	}

}
