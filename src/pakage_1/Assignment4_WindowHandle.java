package pakage_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4_WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		

		// click on the link
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		

		// Getting Window handles

		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();

		
		
		// shifting focus of driver to child window
		driver.switchTo().window(child);
		
		

		// printing the text present on the child window.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='example']")));

		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		
		

		// returning driver to the parent window
		driver.switchTo().window(parent);

		
		
		// printing the text present on the parent window
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}

}
