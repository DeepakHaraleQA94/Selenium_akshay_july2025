package basic_selenium_concept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
		System.out.println(source);
		
		File dest= new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Overview_July2025\\img.png");
		
		FileHandler.copy(source, dest);
	}

}
