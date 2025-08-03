package basic_selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/buttons");		
			Actions action = new Actions(driver);
			WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
			action.doubleClick(doubleClick).perform();
			action.contextClick().perform();

		}

	}



