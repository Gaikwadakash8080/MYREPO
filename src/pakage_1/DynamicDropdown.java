package pakage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"));
		System.out.println(from.getText());
		from.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Aurangabad']")).click();
		
		driver.close();
		

	}

}
