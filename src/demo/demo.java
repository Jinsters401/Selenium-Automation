package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinst\\Selenium_Extraction\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.google.com");
	
		driver.close();*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jinst\\Selenium_Extraction\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver1 = new FirefoxDriver(options);
		
		
		driver1.get("https://www.google.com");
		Thread.sleep(2000);
		driver1.close();
	}

}
