package DomaciMatHotelsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatHotelsPage {

    private WebDriver driver;
    @FindBy(id = "naziv")
    WebElement nazivSmestaja;
    @FindBy(id = "adresa")
    WebElement adresa;
    @FindBy(id = "cena")
    WebElement cena;
    @FindBy(id = "slika")
    WebElement slika;
    @FindBy(css = ".btn.btn-primary")
    WebElement submit1;


    public MatHotelsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNewHouse() {
        nazivSmestaja.sendKeys("Kuca 7");
        adresa.sendKeys("Ulica 77");
        cena.sendKeys("777");
        slika.sendKeys("https://markstewart.com/wp-content/uploads/2021/04/1_SB4-Front-View.jpg");
        submit1.click();
    }

}