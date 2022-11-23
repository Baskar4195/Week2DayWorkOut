package WeekDay2ndweekworkout;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadinLeaf {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+");

		// driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("91");

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("87");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);

		String FirstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		
		System.out.println(FirstLeadId);
		
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	       
	    driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FirstLeadId);
	    
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    String ViewMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	    String Norecords = new String();
	    if (ViewMessage.contains(Norecords)) {
	    	System.out.println("Text Matched");
	    }else {
	    	System.out.println("Text Not match");
	    }
	    
	    Thread.sleep(5000);
	    driver.close();
		
		/*
		 * http://leaftaps.com/opentaps/control/main
		 * 
		 * 11 Capture lead ID of First Resulting lead 12 Click First Resulting lead 13
		 * Click Delete 14 Click Find leads 15 Enter captured lead ID 16 Click find
		 * leads button 17 Verify message "No records to display" in the Lead List. This
		 * message confirms the successful deletion 18 Close the browser (Do not log
		 * out)
		 */
	}

}
