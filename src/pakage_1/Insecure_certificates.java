package pakage_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Insecure_certificates {

	public static void main(String[] args) {

		//Here we need to set the behaviour of our browser to tell him that how to behave in 
		//perticular conditions.
		//To set the behavior of our browser we have options class.
		
		ChromeOptions option = new ChromeOptions();
		//FirefoxOptions option1 = new FirefoxOptions();
		//EdgeOptions option2 = new EdgeOptions();
		
		option.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
		driver.get("https://expired.badssl.com");
		

	}

}
