package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\myfile.png");
		
		Files.copy(f, dest);

	}

}
