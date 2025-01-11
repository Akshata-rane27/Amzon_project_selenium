package amzon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email")).sendKeys("7066531038");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Akshu27598");
	driver.findElement(By.id("signInSubmit")).click();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();
	driver.findElement(By.cssSelector("#desktop_qualifiedBuyBox > div:nth-child(1) > div:nth-child(37) > div:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > input:nth-child(2)")).click();
	Thread.sleep(1000);
	driver.close();
	}

}
