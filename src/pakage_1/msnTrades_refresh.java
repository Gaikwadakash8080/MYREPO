package pakage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class msnTrades_refresh {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String pageURL = "https://www.msn.com/en-in/money/watchlist?tab=Related&id=ahkucw&ocid=ansMSNMoney11&duration=1D&relatedQuoteId=ahkucw&relatedSource=MlAl&src=b_secdans";
		driver.get(pageURL);
		driver.manage().window().maximize();
		
		By idx = By.cssSelector(".mainPrice:nth-of-type(1)");
		
		WebElement index = driver.findElement(idx);
		
		//get the index of the sensex.
		
		System.out.println(index.getText());
		
		/*// get the index of the nifty50
		
		WebElement nifty = driver.findElement(By.xpath("//span[text()='NIFTY']"));
		nifty.click();
		WebElement indexnifty = driver.findElement(By.cssSelector(".mainPrice:nth-of-type(1)"));
		String Nifty = indexnifty.getText();
		System.out.println(Nifty);
		*/
		
		driver.navigate().refresh();
		
		System.out.println(driver.findElement(idx).getText());
		
	}

}
