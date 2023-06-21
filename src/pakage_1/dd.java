package pakage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_content");
		driver.manage().window().maximize();
		
		WebElement makePageStatic = driver.findElement(By.xpath("//a[text()='click here']"));
		
		//on the above page the profile avatar and description gets changed on every refresh.
		
		// for getting the detais of the second avatar.
		
		WebElement avatar2 = driver.findElement(By.xpath("//div[@id='content']/div[2]/div/img"));
				System.out.println(avatar2.getDomAttribute("src"));
				
		WebElement details2 = driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]"));
				System.out.println(details2.getText());
		
			
		makePageStatic.click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div[2]/div/img")).getDomAttribute("src"));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]")).getText());
		
		driver.navigate().refresh();
		Thread.sleep(3000);	
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div[2]/div/img")).getDomAttribute("src"));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]")).getText());
		
	}

}
