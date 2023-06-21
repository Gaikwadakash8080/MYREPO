package pakage_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar_smart {

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
		
		//Book flight on march 4 2023
		
		String travelMonth = "August";
		String travelDate = "10";
				
		
		while (! driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText().contains(travelMonth))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div"));
		
		for(int i = 0; i<list.size();i++)
			
		{
			//System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains(travelDate))
			{
				list.get(i).click();
				Assert.assertFalse(list.get(i).getText().contains(travelDate));
			}
			
			
		}
	
		System.out.println(list.size());
	}

}
