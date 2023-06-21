package pakage_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		//This click will navigate us to the new window/new web page.
		
		
		
		//getting window handle for the windows
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		
		
		//shifting driver focus to child window
		driver.switchTo().window(child);
		String text = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		driver.switchTo().window(parent);
		
		System.out.println(text);
		text.split("at")[1].trim();
		String email= text.split("at")[1].trim().split(" ")[0];		
		/*
		 * same way to write above snipet in single line
		 *String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		*/
		
		
		//verify login
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		//extracting password from the line given below
		
		
		String passText = driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText().split("is")[2].trim();
		System.out.println(passText);   //learning)
		
		String pass = passText.replace(")", "");
		
		
		
		driver.findElement(By.id("password")).sendKeys(pass);
		
		
		
		
		
		
		
		
	}

}
