package pakage_1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pagination {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("(//table//tr//th)[1]")).click();
		
		List<WebElement> veggie = driver.findElements(By.xpath("//tr/td[1]"));
		
		// Create list of veggies present in the table.
		
		List <String> original = veggie.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Create sorted list of vegetables.
		
		List <String> sortedList = original.stream().sorted().collect(Collectors.toList());
		
		//check whether list is in sorted order or not
		
		Assert.assertTrue(original.equals(sortedList));
		
		//List<String> price;
		
		
		
		// get the price of the rice vegetable.
		
		//do{
	
		
		//List <WebElement> item = driver.findElements(By.xpath("//tr/td[1]"));
		//price = item.stream().filter(s -> s.getText().contains("Rice"))
			//	.map(s -> s.getPrice(s)).collect(Collectors.toList());
		
		/*price = item.stream().filter(s -> s.getText().contains("Rice"))

				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if (price.size()<1) {
			
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		} while(price.size()<1);
		
		
		
		*/

	//}
	
	//private static String getPrice(WebElement s) {

		// TODO Auto-generated method stub

		//String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



		//return pricevalue;

		}

}
