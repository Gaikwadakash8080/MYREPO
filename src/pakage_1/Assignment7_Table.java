package pakage_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//WebElement tdriver = driver.findElement(By.xpath("(//table[@id='product'])[1]"));
		
		//Print the number of rows
		
		List <WebElement> rows = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr"));
		System.out.println(rows.size());
		
		
		//print the number of columns
		
		List <WebElement> columns = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr/th"));
		System.out.println(columns.size());
		
		//print the values present in the second row
		
		List <WebElement> row2= driver.findElements(By.xpath("(//table[@id='product'])[1]//tr[3]/td"));
		
		for(int i=0; i<row2.size();i++)
		{
			System.out.println(row2.get(i).getText());
		}
		
		
	}

}
