package przyklad1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/home/krispi/KursSelenium/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void testWikiSearch() {
        driver.get("https://pl.wikipedia.org/");

        WebElement search = driver.findElement(By.id("searchInput"));
        System.out.println(search.isEnabled());
        if (search.isEnabled()) {
            search.sendKeys("Selenium");
            search.submit();
        } else {
            Assert.fail();
        }
        
        if (search.isDisplayed()) {
            search.sendKeys("Selenium");
            search.submit();
        } else
            Assert.fail();
    }


            //System.out.println("Wartosc dla getText: " + searchInput.getText());
            // System.out.println("Wartosc dla getAttribute(\"value\"): " + searchInput.getAttribute("value"));
            // System.out.println("Wartosc dla getAttribute(\"id\"): " + searchInput.getAttribute("id"));
            // System.out.println("Wartosc dla getAttribute(\"name\"): " + searchInput.getAttribute("name"));
            // System.out.println("Wartosc dla getAttribute(\"placeholder\"): " + searchInput.getAttribute("placeholder"));

            WebElement element = driver.findElement(By.id("main-page-column1"));
            //System.out.println(element.getText());

            String atrybut = driver.findElement(By.id("main-page-content")).getAttribute("class");
            //System.out.Println(atrybut);


        @After
        public void tearDown () throws Exception {
            driver.quit();
        }
    }
