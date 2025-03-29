package StepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddCustomerSteps {
    
    WebDriver driver;

    @Given("User is logged in")
    public void userIsLoggedIn() {
        driver = new ChromeDriver();
        driver.get("https://testffc.nimapinfotech.com/");
        driver.findElement(By.id("mat-input-0")).sendKeys("siddiqshaikh1@nimapinfotech.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("admin@123");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    }

    @When("User navigates to {string} page")
    public void navigateToAddCustomer(String page) {
        driver.findElement(By.linkText(page)).click();
    }

    @And("Enters {string}, {string}, {string}")
    public void enterCustomerDetails(String customerName, String email, String phone) {
        driver.findElement(By.id("customerName")).sendKeys(customerName);
        driver.findElement(By.id("customerEmail")).sendKeys(email);
        driver.findElement(By.id("customerPhone")).sendKeys(phone);
    }

    @And("Clicks {string} button")
    public void clickSaveButton(String button) {
        driver.findElement(By.xpath("//button[contains(text(),'" + button + "')]")).click();
    }

    @Then("Customer should be added successfully")
    public void verifyCustomerAdded() {
        WebElement successMessage = driver.findElement(By.className("toast-message"));
        Assert.assertTrue(successMessage.getText().contains("Customer added successfully"));
        driver.quit();
    }
}
