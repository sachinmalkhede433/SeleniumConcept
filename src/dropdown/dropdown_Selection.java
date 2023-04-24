package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_Selection {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		
		Select s= new Select(driver.findElement(By.name("country")));
		
		s.selectByValue("Austria");

	}

}
