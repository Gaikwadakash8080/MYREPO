package pakage_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mytestingthoughts.com/Sample/home.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("first_name")).sendKeys("David");
		driver.findElement(By.name("last_name")).sendKeys("Shaw");
		driver.findElement(By.id("inlineRadioMale")).click();
		
		
		WebElement hobbies = driver.findElement(By.id("exampleFormControlSelect2"));
		
		Select select1 = new Select(hobbies);
		select1.selectByVisibleText("Swimming");
		
		WebElement department = driver.findElement(By.xpath("//select[@name='department']"));
		Select select2 = new Select(department);
		select2.selectByVisibleText("Accounting Office");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("DavidShaw");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("DavidShaw@1122");
		driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("DavidShaw@1122");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("DavidShaw@yahoo.com");
		//driver.findElement(By.xpath("//input[@name='contact_no']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("Hi! this is David Shaw");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(50000));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement msg = driver.findElement(By.xpath("//div[@id='success_message']"));
		
		
		
		if (msg.getText().contains("Success")) {
			System.out.println("Registration Succesful");	
		}
		
		
	}

}
