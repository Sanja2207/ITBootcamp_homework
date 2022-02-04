package PageFactoryPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class DressesCompare {

    WebDriver driver;

    public DressesCompare(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    WebElement hoverFirstDress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    WebElement hoverSecondDress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")
    WebElement addFirstDressToCompare;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a")
    WebElement addSecondDressToCompare;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[3]/div[2]/form/button")
    WebElement compareButton;
    @FindBy(xpath = "//*[@id=\"product_comparison\"]/tbody/tr[2]/td[2]")
    WebElement firstDressName;
    @FindBy(xpath = "//*[@id=\"product_comparison\"]/tbody/tr[2]/td[3]")
    WebElement secondDressName;


    public void addDressesToCompare() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hoverFirstDress);
        Actions action = new Actions(driver);
        action.moveToElement(hoverFirstDress);
        action.moveToElement(addFirstDressToCompare).click().build().perform();
        Thread.sleep(2000);
        action.moveToElement(hoverSecondDress);
        action.moveToElement(addSecondDressToCompare).click().build().perform();
    }

    public void clickCompareButton() {
        compareButton.click();
    }

    public String getFirstDressName() {
        return firstDressName.getText();
    }

    public String getSecondDressName() {
        return secondDressName.getText();
    }
}
