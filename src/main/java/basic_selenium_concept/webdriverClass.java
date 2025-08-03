package basic_selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.xpath("//input[@placeholder='Email or Mobile No']")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
//		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
		
		
		
		
	}
}
