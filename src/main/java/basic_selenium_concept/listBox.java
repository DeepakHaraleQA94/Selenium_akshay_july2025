package basic_selenium_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		WebElement country_id = driver.findElement(By.id("CountryId"));
		Select select = new Select(country_id);
		Thread.sleep(3000);
		select.selectByVisibleText("India");
		Thread.sleep(3000);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByValue("7");
		 List<WebElement> list = country_id.findElements(By.tagName("option"));
		 for(int i=0; i<list.size();i++) {
			 System.out.println(list.get(i).getText());
		 }
		 
		 
		
		
		
		
		
	}
}
