package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSteps
{
    WebDriver driver;

    @Given("I open edge browser")
    public void i_open_edge_browser() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\fatiu\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @When("I navigate to website")
    public void i_navigate_to_aviata() {
        driver.get("https://aviata.kz/");
        driver.manage().window().maximize();
    }

    @When("I type all data to form")
    public void i_type_all_data_to_form() {
        driver.findElement(By.xpath("//input[@placeholder='Откуда']")).click();
        driver.findElement(By.xpath("//body/div/section/div/form/div/div/div[contains(@data-qa-id,'desktop-main-city-from')]/div/div/ul/li[2]/div[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Куда']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]/div[1]")).click();
        driver.findElement(By.xpath("//div[@id='desktop-main-date-from']")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/section[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[2]/div[1]/div[2]/button[12]")).click();
    }

    @When("I hit Enter")
    public void i_hit_enter(){
        driver.findElement(By.xpath("//button[contains(text(),'Найти')]")).click();
    }

    @Then("I should be shown the results")
    public void i_should_be_shown_the_results() {
        System.out.println("Successful booked");
    }
}
