package pakage_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("frame-top");
		
		
		
		driver.switchTo().frame("frame-middle");
		
		
		
		String text = driver.findElement(By.id("content")).getText();
		System.out.println(text);
		}


	}


