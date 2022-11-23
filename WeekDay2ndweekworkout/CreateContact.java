package WeekDay2ndweekworkout;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Baskar");
		
		driver.findElement(By.id("lastNameField")).sendKeys("M");
		
		driver.findElement(By.name("firstNameLocal")).sendKeys("Baskar");
		
		driver.findElement(By.name("lastNameLocal")).sendKeys("M");
		
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		
		driver.findElement(By.name("description")).sendKeys("AutomationTesting");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("Baskar4195@gmail.com");
		
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).click();
		
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select St = new Select(State);
		
		St.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.xpath("//div/a[text()='Edit']")).click();
		
		driver.findElement(By.name("description")).clear();
		
        driver.findElement(By.name("importantNote")).sendKeys("Automate your wish");
        
        driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		
        String title = driver.getTitle();
        
        System.out.println(title);
		
	}

}
