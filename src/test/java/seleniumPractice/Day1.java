package seleniumPractice;
import org.openqa.selenium.chrome.*;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:/webdriver/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		/*WebElement alertbox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		alertbox.click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertmessage = driver.switchTo().alert().getText();
		
		System.out.println(alertmessage);
		
		alert.dismiss();*/
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandle());
		
		WebElement orangehrm = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a"));
		
		orangehrm.click();
		
		Set<String>windowids = driver.getWindowHandles();
		
		System.out.println(windowids);
		

	}

}
