package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open amil.com signup
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        WebElement createNewAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("hsdjhd");
    }
}
