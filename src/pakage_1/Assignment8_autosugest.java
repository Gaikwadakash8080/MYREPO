package pakage_1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8_autosugest {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		Actions action = new Actions (driver);
		
		//Complete task using Mouse and Keyboard actions.
		
		WebElement box = driver.findElement(By.id("autocomplete"));
		
		action.moveToElement(box).click().sendKeys("ind").build().perform();
		
		Thread.sleep(1000);
		
		box.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		box.sendKeys(Keys.DOWN,Keys.ENTER);
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.id("autocomplete")).getText()); 
		
		
		
	}

}
