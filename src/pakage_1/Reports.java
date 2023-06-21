package pakage_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void envokeReport() {
		//ExtentSparkReporter, ExtentReports
		
		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	
	@Test
	public void pageTitle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		extent.createTest("pageTitle");
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		extent.flush();
		
	}
	
}
