package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String CU = driver.getCurrentUrl();
		String TP = driver.getTitle();
		
		
		System.out.println("Title = "+TP+" Title lenght = "+TP.length());
		System.out.println("Current URL = "+CU+" Current URL lenght = "+CU.length());
		System.out.println("Page Source = "+driver.getPageSource());
		System.out.println("Length of Page Source = "+driver.getPageSource().length());
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		driver.close();
		driver.quit();
		
		
		
		
	}

}
