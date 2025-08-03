package basic_selenium_concept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddent_popUp {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Popups")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn-six")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("confirm")).click();
		Thread.sleep(3000);
		 Alert alt = driver.switchTo().alert();
		 
		 alt.dismiss();
			Thread.sleep(3000);
		driver.findElement(By.id("btn-one")).click();
		 String mainId = driver.getWindowHandle();
		 System.out.println(mainId);
		
		   Set<String> AllwindowsId = driver.getWindowHandles();
		System.out.println(AllwindowsId);
		
		 Iterator<String> itr = AllwindowsId.iterator();
		  String mainWindow = itr.next();
		System.out.println(mainWindow);
		 String chidId = itr.next();
		 System.out.println(chidId);
		 driver.switchTo().window(chidId);
		 driver.manage().window().maximize();
			Thread.sleep(3000);
//		 driver.findElement(By.xpath("(//span[@class='clOx1e sjVJQd'])[1]")).click();
		 driver.findElement(By.linkText("Gmail")).click();
 
		 driver.switchTo().window(mainWindow);
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Home")).click();
	}
}
