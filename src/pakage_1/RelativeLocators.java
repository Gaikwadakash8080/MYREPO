package pakage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		/*
		 * Relative locators are newly introduced locators in selenium 4.
		 * To use the relative locators we have to import one package which is a static package. static packages are not auto suggested in selenium.
		 * import static org.openqa.selenium.support.locators.RelativeLocator.*;
		 * 
		 * we use static locators when there are not enough attributes are present for the webelement so based upon the adjecent webelements we
		 * need to locate those type of elements by using the methods provided by this relativelocator package and the tagname of that 
		 * particular element.
		 * 
		 * there are four methods to identify the element by relativelocator.
		 * toright()
		 * toleft()
		 * above()
		 * below()
		 *  
		 */
		
		
		//method 1.
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		
		
		
		//method 2.
		
		WebElement email = driver.findElement(By.xpath("(//label)[2]"));
		
		WebElement field = driver.findElement(with(By.tagName("input")).below(email));
		
		System.out.println(field.getTagName());
		field.click();
		field.sendKeys("hello");
		/*
		 * here the driver is unable to locate the element we want to locate instead of that it is shifting
		 * directly to the check box. reason we don't know. maybe driver is not support this method
		 * when we use relative locators relationship with locators.
		 * 
		 */
		
		
		
		
		//method 3.
		
		WebElement label = driver.findElement(By.xpath("//label[@class='form-check-label']"));
	
		driver.findElement(with(By.tagName("input")).toLeftOf(label)).click();
		
		
		
		//method 4. 
		
		WebElement radio = driver.findElement(By.id("inlineRadio2"));
		radio.click();
		String radioText =  driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText();
		
		System.out.println(radioText);
				
		
	}

}
