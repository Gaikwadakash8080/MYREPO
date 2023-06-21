package pakage_1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Automation_01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		// making the array of our things needed items.
		String[] thingsNeeded = { "Brocolli", "Cauliflower", "Tomato", "Cucumber" };

		// Identifying the locators for the needed items.
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@class='product']//h4"));

		for (int i = 0; i < itemList.size(); i++) {
			String[] itemName = itemList.get(i).getText().split("-");
			String formatedName = itemName[0].trim();

			// converting thingsNeeded Array into list for easy search.
			List<String> thingsNeededList = Arrays.asList(thingsNeeded);

			// checking whether the formatedName(item) present in the thingsNeededList
			int j = 0;
			if (thingsNeededList.contains(formatedName)) {

				j++;
				// if present then add to Cart
				driver.findElements(By.cssSelector("[class='product-action'] [type='button']")).get(i).click();

				// driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// stop the loop if all the items in the neededList are added to kart
				if (j == thingsNeeded.length) {
					break;
				}

			}

		}
		driver.findElement(By.cssSelector("[class='cart-icon']")).click();
		driver.findElement(By.xpath("(//div[@class='action-block']/button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("RahulShettyAcademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		// Navigated to the country page
		// select Country from the Dropdrown

		WebElement dd = driver.findElement(By.tagName("select"));
		Select select = new Select(dd);
		dd.click();

		select.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}

}
