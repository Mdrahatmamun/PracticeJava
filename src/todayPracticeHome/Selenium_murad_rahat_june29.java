package todayPracticeHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_murad_rahat_june29 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https//:walmart.com");
		driver.manage().window().maximize(); // Fullscreen () method
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
		driver.quit();

	}

}
