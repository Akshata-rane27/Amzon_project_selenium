package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginStep {
    WebDriver driver;

    @Given("login page should be open in default browser")
    public void login_page_should_be_open_in_default_browser() {
    	System.setProperty("Webdriver.firefox.driver","\"C:\\Users\\aksha\\OneDrive\\Desktop\\jar\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testffc.nimapinfotech.com/");
    }

    @When("click on emailid field then enter {string}")
    public void click_on_emailid_field_then_enter(String username) {
        WebElement emailField = driver.findElement(By.id("mat-input-0"));  // Corrected locator
        emailField.clear();
        emailField.sendKeys(username);
    }

    @And("go to password and enter {string}")
    public void go_to_password_and_enter(String password) {
        WebElement passwordField = driver.findElement(By.id("mat-input-1"));  // Corrected locator
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    @Then("Signin {string}")
    public void signin(String status) {
        WebElement signinButton = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
        signinButton.click();

        try {
            Thread.sleep(3000);  // Wait for response (avoid hardcoding waits in actual framework)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (status.equalsIgnoreCase("Fail")) {
            // Validate failure - checking for error message popup
            boolean isErrorDisplayed = driver.findElements(By.xpath("//mat-error")).size() > 0;
            if (!isErrorDisplayed) {
                throw new AssertionError("Expected login failure, but no error message was displayed.");
            }
        }
    }
}
