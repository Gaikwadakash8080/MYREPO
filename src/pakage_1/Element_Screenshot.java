package pakage_1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Element_Screenshot {

	public static void main(String[] args) throws IOException {
		
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

		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);

		
		// take the screenshot of the name WebElement
		
		File source = name.getScreenshotAs(OutputType.FILE);
		
		String rdmName = RandomString.make(4);
		File dest = new File("C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\Screenshots\\"+rdmName+".png");
		
		FileHandler.copy(source, dest);
		
		
		
		//driver.quit();


	}

}
