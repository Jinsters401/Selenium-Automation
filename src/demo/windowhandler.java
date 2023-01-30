package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String wa;
		
		wa = "C:\\Users\\jinst\\\\Selenium_Extraction\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",wa);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window Handle: "+parent);
		
		for(int i = 1;i<=3;i++)
		{
			driver.findElement(By.xpath("//button[@id='windowButton']")).click();
			Thread.sleep(2000);
		}
		Set<String> win= driver.getWindowHandles();
		
		for(String handle:win) {
			System.out.println("The window handles are "+handle);
		}
	}

}
