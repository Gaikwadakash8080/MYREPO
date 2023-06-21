package pakage_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\02\\Drivers\\chromedriver_win32(V109)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("RahulShettyAcademy");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("7896546894");
		driver.findElement(By.className("signInBtn")).click();
	
		WebElement link1 = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println(link1.getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("Rahul");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("rahul@rsa.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9988556633");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
	}

}
