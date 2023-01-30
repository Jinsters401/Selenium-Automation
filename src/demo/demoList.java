package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//List<WebElement> link=driver.findElement(By.tagName("a"));
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		for(WebElement l : link)
		{
			System.out.println(l.getText());
		}
		
	}

}
