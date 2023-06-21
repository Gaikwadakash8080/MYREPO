package pakage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class msnTrade {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String pageURL = "https://www.msn.com/en-in/money/watchlist?tab=Related&id=ahkucw&ocid=ansMSNMoney11&duration=1D&relatedQuoteId=ahkucw&relatedSource=MlAl&src=b_secdans";
		driver.get(pageURL);
		driver.manage().window().maximize();
		
		
		WebElement indexsensex = driver.findElement(By.cssSelector(".mainPrice:nth-of-type(1)"));
		
		//get the index of the sensex.
		String Sensex = indexsensex.getText();
		System.out.println(Sensex);
		
		// get the index of the nifty50
		
		WebElement nifty = driver.findElement(By.xpath("//span[text()='NIFTY']"));
		nifty.click();
		WebElement indexnifty = driver.findElement(By.cssSelector(".mainPrice:nth-of-type(1)"));
		String Nifty = indexnifty.getText();
		System.out.println(Nifty);
		
	}

}
