package pakage_1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyFilter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List <WebElement> result =  driver.findElements(By.xpath("//tr/td[1]"));
		
		List <WebElement> filterResult = result.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		
		Assert.assertEquals(result.size(), filterResult.size());
		
		
		
		
	}

}
