package amzon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_page {

	public static void main(String[] args) {
		System.setProperty("Webdriver.firefox.driver","\"C:\\Users\\aksha\\OneDrive\\Desktop\\jar\\geckodriver-v0.35.0-win32\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email")).sendKeys("7066531038");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Akshu27598");
	driver.findElement(By.id("signInSubmit")).click();
	driver.close();
	}
	


	

}
