package test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom_ele.login_ele;

public class login_test_class {
	private WebDriver driver;
	private login_ele fbg_object;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void varify_email_pass() {
		fbg_object = new login_ele(driver);
		fbg_object.email_enter();

	}

	@Test
	public void varify_title() {

		System.out.println("hello facebook");

	}

	@AfterMethod
	public void AfterTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
