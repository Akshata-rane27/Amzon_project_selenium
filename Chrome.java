import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\aksha\\OneDrive\\Desktop\\jar\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		 WebDriver driver = new ChromeDriver();
	}

}
