package pakage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_pass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\02\\Drivers\\chromedriver_win32(V109)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		
		String text = driver.findElement(By.xpath("//p[@class = 'infoMsg']")).getText();
		String [] arr1 = text.split("'");
		String password = arr1[1].split("'")[0];
		System.out.println(password);
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();
		System.out.println("Browser Close Succesfully");
	
	}

}
