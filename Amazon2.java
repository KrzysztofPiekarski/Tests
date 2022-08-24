package przyklad1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Amazon2 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/home/krispi/KursSelenium/src/main/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testAmazonSearch() {
        WebElement name = driver.findElement(By.id("first-name"));

        if (name.isDisplayed()) {
            name.clear();
            name.sendKeys("Karol");
            System.out.println("name: " + name.getAttribute("value"));
            name.submit();
        } else {
            Assert.fail();
        }

        WebElement surname = driver.findElement(By.id("last-name"));

        if (surname.isDisplayed()) {
            surname.clear();
            surname.sendKeys("Kowalski");
            System.out.println("surname: " + surname.getAttribute("value"));
            surname.submit();
        } else {
            Assert.fail();
        }

        WebElement genderRadioButton = driver.findElement(By.className("radio-inline"));
        WebElement genderRadioLabel = driver.findElement(By.xpath("//label[@for='gender']"));
        //maleButton.click();
        genderRadioButton.submit();


        WebElement dateOfBirthInput = driver.findElement(By.id("dob"));
        if (dateOfBirthInput.isDisplayed()) {
            dateOfBirthInput.click();
            dateOfBirthInput.sendKeys("05/22/2010");
            System.out.println("dateOfBirth: " + dateOfBirthInput.getAttribute("value"));
            dateOfBirthInput.submit();
        } else {
            Assert.fail();
        }

        WebElement address = driver.findElement(By.id("address"));
        if (address.isDisplayed()) {
            address.click();
            address.sendKeys("Prosta 51");
            System.out.println("address: " + address.getAttribute("value"));
            address.submit();
        } else {
            Assert.fail();
        }

        WebElement email = driver.findElement(By.id("email"));
        if (email.isDisplayed()) {
            email.click();
            email.sendKeys("karol.kowalski@mailinator.com");
            System.out.println("email: " + email.getAttribute("value"));
            email.submit();
        } else {
            Assert.fail();
        }

        WebElement password = driver.findElement(By.id("password"));
        if (password.isDisplayed()) {
            password.click();
            password.sendKeys("Pass123");
            System.out.println("password: " + password.getAttribute("value"));
            password.submit();
        } else {
            Assert.fail();
        }

        WebElement company = driver.findElement(By.id("company"));
        if (company.isDisplayed()) {
            company.click();
            company.sendKeys("Coders Lab");
            System.out.println("company: " + company.getAttribute("value"));
            company.submit();
        } else {
            Assert.fail();
        }

        WebElement role = driver.findElement(By.id("role"));
        if (role.isDisplayed()) {
            Select selectRole = new Select(role);
            selectRole.selectByVisibleText("QA");
            //new Select(driver.findElement(By.id("role"))).selectByIndex(1);
            //selectRole.selectByIndex(1);
        } else {
            Assert.fail();
        }

        WebElement jobExpectation = driver.findElement(By.name("expectation"));
        if (jobExpectation.isDisplayed()) {
            Select jobExpectationSelect = new Select(jobExpectation);
            jobExpectationSelect.selectByVisibleText("Nice manager/leader");
            jobExpectationSelect.selectByVisibleText("Chance to go onsite");
        } else {
            Assert.fail();
        }

        //WebElement waysOfDevelopment = driver.findElement(By.className("col-sm-10 development-ways"));
        //waysOfDevelopment.findElements(By.tagName("input")).get(0).click();
        //waysOfDevelopment.findElements(By.tagName("input")).get(3).click();

        WebElement comment = driver.findElement(By.id("comment"));
        if (comment.isDisplayed()) {
            comment.click();
            comment.sendKeys("To jest mój pierwszy test");
            System.out.println("comment: " + comment.getAttribute("value"));
            comment.submit();
        } else {
            Assert.fail();
        }

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
       assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
       //assertTrue(driver.findElement(By.id("submit-msg")).getText().equals("Successfully submitted!"));
    }
    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}
