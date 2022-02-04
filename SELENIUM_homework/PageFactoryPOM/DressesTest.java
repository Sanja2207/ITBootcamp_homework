package PageFactoryPOM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DressesTest {
    public static WebDriver driver;

    @BeforeClass
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void happyPath() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=8&controller=category", "The url should be 'http://automationpractice.com/index.php?id_category=8&controller=category' ");

        DressesCompare dress = new DressesCompare(driver);

        dress.addDressesToCompare();
        dress.clickCompareButton();

        String firstDressName = dress.getFirstDressName();
        String secondDressName = dress.getSecondDressName();

        Assert.assertEquals(firstDressName, "Colorful Dress", "The first dress name should be 'Colorful Dress' ");
        Assert.assertEquals(secondDressName, "Short Dress", "The second dress name should be 'Short Dress' ");
        System.out.println("Both dress are added to compare");
    }
}