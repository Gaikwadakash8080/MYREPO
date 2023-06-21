package pakage_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String defaultPage = driver.getWindowHandle();
		
		// navigate method will open the new url in the same window.
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		//How to open new tab within the browser.
		
		
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
		
		newTab.get("https://www.youtube.com");
		newTab.manage().window().maximize();
		String childPage = newTab.getWindowHandle();
		
		System.out.println(defaultPage);
		System.out.println(childPage);
		
		//driver.close();
		driver.quit();
		
	}

}
