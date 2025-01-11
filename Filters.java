package amzon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filters {

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
	driver.findElement(By.cssSelector("#p_n_feature_three_browse-bin\\/27015592031 > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")).click();
	driver.findElement(By.cssSelector("#p_n_feature_nine_browse-bin\\/30060561031 > span:nth-child(1) > a:nth-child(1) > div:nth-child(1)")).click();
	driver.findElement(By.cssSelector("#p_n_size_two_browse-vebin\\/1480401031 > span:nth-child(1) > a:nth-child(1) > span:nth-child(1) > div:nth-child(1)")).click();
	
	Thread.sleep(1000);
driver.close();

	}

}
