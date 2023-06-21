package pakage_1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cc {

	WebDriver driver;

	public static void main(String[] args) throws Exception {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\ChromeDriver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();

		// login Credentials

		WebElement uid = driver.findElement(By.xpath("//input[@name='uid']"));
		uid.sendKeys("mngr488174");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("rEhepat");

		WebElement login_button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login_button.click();

		Thread.sleep(3000);

		WebElement select_NewCustomer = driver.findElement(By.xpath("//a[text()='New Customer']"));
		select_NewCustomer.click();

		Thread.sleep(3000);

		// Alert alt=driver.switchTo().alert();
		// alt.dismiss();

		// WebElement page=driver.findElement(By.xpath("//div[@id='ad_position_box']"));
		// page.findElement(By.xpath("//div[@id='dismiss-button']")).click();

//		WebElement handle_Page=driver.findElement(By.xpath("//div[@id='dismiss-button']"));
//		handle_Page.click();
//		Alert alt=driver.switchTo().alert();
//		alt.dismiss();
//		
		// Thread.sleep(3000);

		String path = "C:\\Users\\Shree\\EclipseWorkplace\\Project_Selenium\\Screenshots\\data.xlsx";

		FileInputStream fs = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(fs);

		String data_0_1 = wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();

		String data_1_1 = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();

		String data_2_1 = wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();

		String data_3_1 = wb.getSheet("sheet1").getRow(3).getCell(1).getStringCellValue();

		String data_4_1 = wb.getSheet("sheet1").getRow(4).getCell(1).getStringCellValue();

		String data_5_1 = wb.getSheet("sheet1").getRow(5).getCell(1).getStringCellValue();

		String data_6_1 = wb.getSheet("sheet1").getRow(6).getCell(1).getStringCellValue();

		String data_7_1 = wb.getSheet("sheet1").getRow(7).getCell(1).getStringCellValue();

		String data_8_1 = wb.getSheet("sheet1").getRow(8).getCell(1).getStringCellValue();

		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(data_0_1);
		System.out.println(data_0_1);

		WebElement Gender = driver.findElement(By.xpath("//input[@name='rad1']"));
		Gender.click();

		WebElement DOB = driver.findElement(By.xpath("//input[@name='dob']"));
		DOB.sendKeys(data_2_1);
		System.out.println(data_2_1);

	}

}
