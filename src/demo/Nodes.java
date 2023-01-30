package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nodes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String chromePath,chromeDriver,webAddress,webAddress2;
		
		chromePath = "C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe";
		chromeDriver = "webdriver.chrome.driver";
		webAddress = "https://shop.polymer-project.org/";
		webAddress2 = "https://books-pwakit.appspot.com/";
		
		System.setProperty(chromeDriver, chromePath);
		WebDriver driver;
				
		driver = new ChromeDriver(); 	
		driver.get(webAddress2);
		driver.manage().window().maximize();
		
			
		//Thread.sleep(1000);
		WebElement host = driver.findElement(By.tagName("book-app"));
		
		//Shadow Dom 
		JavascriptExecutor j = (JavascriptExecutor)driver; 
		SearchContext shadowdom = (SearchContext) j.executeScript("return arguments[0].shadowRoot", host);
		
		WebElement appHeader = shadowdom.findElement(By.cssSelector("app-header"));
	
		WebElement appToolbar = appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement book = appToolbar.findElement(By.tagName("book-input-decorator"));
		book.findElement(By.cssSelector("input#input")).sendKeys("Eat Me!");
		
	}

}
