
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    /**Posetite stranicu https://www.wikipedia.org/
Promenite jezik iz padajuceg menija u input polju na Srpski
Pronadjite input polje I unesite u njega kljuc “Java”
Od ponudjenih pretraga izaberite  Java(Programski jezik)
Proverite da li je naslov na otvorenoj stranici odgovarajuci. */

public class DomaciWIkipedija {

    WebDriver driver;

    public void invokeBrowser() {

        try {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

            driver.get("https://www.wikipedia.org/");
            searchJava();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchJava() throws InterruptedException {

        WebElement srpski = driver.findElement(By.xpath("//option[contains(text(),'Српски / Srpski')]"));
        srpski.click();
        Thread.sleep(3000);
        WebElement unos = driver.findElement(By.xpath("//input[@id='searchInput']"));
        unos.sendKeys("Java");
        Thread.sleep(3000);
        WebElement java = driver.findElement(By.xpath("//body/div[3]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/a[2]"));
        java.click();
        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://sr.wikipedia.org/wiki/Java_(%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D1%81%D0%BA%D0%B8_%D1%98%D0%B5%D0%B7%D0%B8%D0%BA)")) {
            System.out.println("uspesno");
        } else {
            System.out.println("greska");
        }

        driver.close();


    }


    public static void main(String[] args) {
        DomaciWIkiped myObj = new DomaciWIkiped();
        myObj.invokeBrowser();

    }
}

