package pakage_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		
		
		
		// Check Whether we can write WebDriver driver = new WebDriver();
		
		
		//WebDriver driver = new WebDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		/*It is seen that We can not Write WebDriver driver = new WebDriver();
		 * 
		 * 1. We can not create object of the interface.
		 * 2. new keyword is responsible for instantiating the class by creating an object and
		 *    allocating memory space for it. This object created refers to the memory allocated.
		 * 3. a new keyword is followed by a call to the constructor.
		 * 4. An interface cannot contain a constructor (as it cannot be used to create objects)
		 * 
		 */

	}

}
