package pakage_1;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Flight_Ticket {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//provide some global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Book for one way ticket

		driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();

		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.click();
		driver.findElement(By.xpath("//div[text()='BOM']")).click(); // From point
		driver.findElement(By.xpath("//div[text()='DEL']")).click(); // Destination point

		driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-day-28'])[1]")).click(); // Date of Journey

		// Verifying that the return date calendar is disabled.

		if (driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]"))
				.getAttribute("style").contains("1")) {
			Assert.assertFalse(true);
			System.out.println("The Calender is Enabled");
		}

		else {
			Assert.assertTrue(true);
		}

		// Booking ticket for 4 adults.
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

		for (int i = 1; i < 4; i++) {

			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

		// verify correct quantity of ticket is selected

		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		Thread.sleep(2000);

		// Select the currency for payment
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		List<WebElement> currencyList = driver.findElements(
				By.cssSelector(".css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-1rjd0u6.r-1g94qm0.r-h3f8nf.r-u8s1d.r-8fdsdq"));
		for (int i = 0; i < currencyList.size(); i++) {

			String currencyName = currencyList.get(i).getText();
			String value = "USD";

			if (currencyName.contains(value)) {
				System.out.println("I found USD");
				currencyList.get(i).click();
				break;
			}
		}

		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(10000);
		driver.close();
	}

}