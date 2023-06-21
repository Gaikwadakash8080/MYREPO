package pakage_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllProducts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		// open the amazon website
		
		String url = "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=5702752666491111821&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300363&hvtargid=kwd-10573980&hydadcr=14453_2316415";
		driver.get(url);
		
		// search for the product 'pen'.
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("pen");
		searchBox.sendKeys(Keys.ENTER);
		
		
		/* 
		 * Get the common locator for all the results shown for pen on the webpage.
		 * print the name of the every product from results.
		 */
		
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']//h2"));
		System.out.println(products.size());
		
		for (int i=0; i<products.size(); i++) {
			System.out.println(products.get(i).getText());
		}

	}

}
