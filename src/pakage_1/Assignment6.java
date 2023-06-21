package pakage_1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		
		//click on first check box option
		driver.findElement(By.id("checkBoxOption1")).click();
		String label = driver.findElement(By.xpath("(//fieldset)[4]/label[1]")).getText();
		
		
		//select the same option from the dropdown
		List <WebElement> dd = driver.findElements(By.xpath("//select/option"));
		System.out.println(dd.size());
		
		

		
				Select select = new Select (driver.findElement(By.xpath("//select")));
				select.selectByVisibleText(label);
		
				
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		
		String s = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		if(s.contains(label))
		{
			System.out.println("TC001 PASS");
		} else {
			System.out.println("TC001 FAIL");
		}
		
		
	}

}
