package amzon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplesearching {

	public static void main(String[] args) throws InterruptedException{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email")).sendKeys("*****");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("*****");
	driver.findElement(By.id("signInSubmit")).click();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("table");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.close();

	}

}
