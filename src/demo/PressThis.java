package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressThis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Lemon Juice");
		Thread.sleep(50);
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
	}

}
