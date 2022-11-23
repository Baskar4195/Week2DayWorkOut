package WeekDay2ndweekworkout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRadioButton {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.name("firstname")).sendKeys("danny");

		driver.findElement(By.name("lastname")).sendKeys("dashh");

		driver.findElement(By.name("reg_email__")).sendKeys("dashdanny70@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("dashdanny70@gmail.com");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Thejabaskar@2006");

		driver.findElement(By.name("birthday_day")).sendKeys("20");

		driver.findElement(By.name("birthday_month")).sendKeys("06");

		driver.findElement(By.name("birthday_year")).sendKeys("2003");

		WebElement Gender = driver
				.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Female']]"));
		System.out.println("Before : " + Gender.isSelected());
		if (!(Gender.isSelected())) {
			Gender.click();
		}
		System.out.println("After : " + Gender.isSelected());
		driver.close();

	}
	
}
