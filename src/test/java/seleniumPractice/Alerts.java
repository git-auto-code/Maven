package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","E:/drivers/chromedriver-win64/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alertbox = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();
		String alertmeassage = driver.switchTo().alert().getText();
		System.out.println(alertmeassage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();

	}

}
