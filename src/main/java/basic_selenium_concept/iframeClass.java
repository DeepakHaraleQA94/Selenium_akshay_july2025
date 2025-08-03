package basic_selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeClass {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("iFrames")).click();
		Thread.sleep(2000);
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('iframe2').scrollIntoView()");
		driver.switchTo().frame("iframe2");
		driver.findElement(By.linkText("Toggle navigation")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
	}
}
