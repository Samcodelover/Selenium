import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkClass2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("aahshd");
        Thread.sleep(1000);

        driver.findElement(By.xpath(("//button[starts-with(@onclick,'show')]"))).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
