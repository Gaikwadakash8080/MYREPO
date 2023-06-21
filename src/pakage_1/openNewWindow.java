package pakage_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openNewWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parrenthandle = it.next();
		String childhandle = it.next();

		driver.switchTo().window(childhandle);
		driver.get("https://www.rahulshettyacademy.com");

		String courseName = driver.findElements(By.xpath("//h2//a")).get(0).getText();

		driver.switchTo().window(parrenthandle);

		driver.findElement(By.name("name")).sendKeys(courseName);

		driver.quit();

	}

}
