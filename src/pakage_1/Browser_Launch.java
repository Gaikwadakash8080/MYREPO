package pakage_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		
		//Launch with Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\02\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
		driver.manage().window().maximize();
		driver.close();
		
		
		//Launch with msedge
		System.setProperty("webdriver.edge.driver", "D:\\02\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
		driver2.manage().window().maximize();
		driver2.close();
		
		
		//Launch with FireFox
		System.setProperty("webdriver.gecko.driver", "D:\\02\\Drivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
		driver1.manage().window().maximize(); 
		driver1.close();
		 		

	}

}
