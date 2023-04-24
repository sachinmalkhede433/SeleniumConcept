package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeApplication {

	public static void main(String[] args) {
		
    	WebDriver driver = new ChromeDriver();	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
