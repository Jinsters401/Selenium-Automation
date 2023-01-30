package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().window().maximize();
		
		//Xpath axes
		//self node
		String selfnode = driver.findElement(By.xpath("//a[contains(.,'Margo Finance')]/self::a")).getText();
		//parent node
		String parentnode = driver.findElement(By.xpath("//a[contains(.,'Margo Finance')]/parent::td")).getText();
		System.out.println("The self node is "+ selfnode);
		System.out.println("The parent node is "+ parentnode);
		
		List<WebElement> childnode = driver.findElements(By.xpath("//a[contains(.,'Margo Finance')]/ancestor::tr/child::*"));
		System.out.println("The # of child nodes are "+childnode.size());
		
		String ancestornode = driver.findElement(By.xpath("//a[contains(.,'Margo Finance')]/ancestor::tr")).getText();
		System.out.println("The ancestor node is "+ancestornode);
		
	}

}
