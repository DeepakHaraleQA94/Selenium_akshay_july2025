package basic_selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/#");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('draggable').scrollIntoView()");
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	WebElement drag = driver.findElement(By.id("draggable"));
	Thread.sleep(2000);
	WebElement drop = driver.findElement(By.id("droppable"));
	action.clickAndHold(drag).perform();
	action.release(drop).perform();
}
}

