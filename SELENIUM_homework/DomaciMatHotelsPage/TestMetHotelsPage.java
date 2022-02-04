package DomaciMatHotelsPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;


public class TestMetHotelsPage {

    WebDriver driver;

    @BeforeClass
    public void inwokeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://it-255-dz-06-andjela-bojic3972.vercel.app/");
    }

    /**
     * TEST ID : 1
     * 1. uneti URL https://it-255-dz-06-andjela-bojic3972.vercel.app/#
     * 2. assetovati da je browser uspeno pokrenuo zadati URL
     */

    @Test
    public void URL() {

        //Assert that the current url is correct
        String expectedURL = "https://it-255-dz-06-andjela-bojic3972.vercel.app/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    /**
     * TEST ID : 2
     * 1. Otvoriti browser i uneti https://it-255-dz-06-andjela-bojic3972.vercel.app/# I otici na sajt.
     * 2. Kliknuti u gornjem delu stranice na Naziv.
     * 3. Uneti "Kuca 7"
     * 4. Kliknuti u polje adrese
     * 5. Uneti "Ulica 77"
     * 6. Kliknuti u polje cena
     * 7. Uneti "777"
     * 8. Kliknuti u polje slika
     * 9. Uneti "https://markstewart.com/wp-content/uploads/2021/04/1_SB4-Front-View.jpg"
     * 10.Kliknuti na Submit
     * 11.Assertoveti da su se podaci koje smo uneli pojavili u ponudi na desnoj strani stanice, na kraju liste.
     */

    @Test
    public void addHouse() {

        MatHotelsPage house = new MatHotelsPage(driver);
        house.addNewHouse();
        Assert.assertTrue(driver.getPageSource().contains("Kuca 7"));

    }

    @AfterClass
    public void closeBrowser() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        driver.quit();
    }


}
