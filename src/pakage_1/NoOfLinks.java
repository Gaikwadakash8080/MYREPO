package pakage_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		
		
		// Print the total number of links present on the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		

		// print the total number of links present on the footer section of the page
		//Creating the subDriver whose access is limited to the footer section only
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		
		
		// print the total number of links present on the first column of footer section.
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("(//table)[3]/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("li")).size());
		
		
		
		
		// verify that the links present on the first column are active(navigating user to other page)
		
		for (int i=0; i<columnDriver.findElements(By.tagName("li")).size();i++)
		{
			String openLink = Keys.chord(Keys.CONTROL,Keys.ENTER); //Combination of keys to open link in new tab
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(openLink);
		
		}	
			
			Set <String> handles = driver.getWindowHandles();
			Iterator <String> it = handles.iterator();
			
			while (it.hasNext())
			{
				System.out.println(driver.switchTo().window(it.next()).getTitle());
			}}
}
