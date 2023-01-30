package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com");
		//absolute
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
		
		//Relative
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts for men");
		//driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Fish hooks");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Best Match')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Time: ending soonest']")).click();
		
		//driver.close();
	}

}
