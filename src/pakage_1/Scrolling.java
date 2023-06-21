package pakage_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Scrolling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,800)");
		
		
		// get the values from column 4 of the table and check whether their sum is correct or not
		
		WebElement tabledriver = driver.findElement(By.cssSelector(".tableFixHead"));
		
		List <WebElement> values = tabledriver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		for (int i=0; i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		
		String total = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
		
		int ttl = Integer.parseInt(total);
		
		Assert.assertEquals(sum, ttl);
		
		
	}

}
