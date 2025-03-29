package StepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PunchInSteps {
    
    WebDriver driver;

    @Given("User is logged in")
    public void userIsLoggedIn() {
        // Reusing login steps
    	System.setProperty("Webdriver.firefox.driver","\"C:\\Users\\aksha\\OneDrive\\Desktop\\jar\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testffc.nimapinfotech.com/");
        driver.findElement(By.id("mat-input-0")).sendKeys("siddiqshaikh1@nimapinfotech.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("admin@123");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    }

    @When("User clicks on {string} button")
    public void userClicksOnPunchIn(String button) {
        driver.findElement(By.xpath("//button[contains(text(),'Punch In')]")).click();
    }

    @Then("A toast message should be displayed with {string}")
    public void verifyToastMessage(String expectedMessage) {
        WebElement toastMessage = driver.findElement(By.className("toast-message"));
        String actualMessage = toastMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        driver.quit();
    }
}
