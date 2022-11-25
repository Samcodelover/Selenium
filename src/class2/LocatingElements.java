package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();
        //enter the Username in the TextBox
        //locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("gdgs");
        driver.findElement(By.id("pass")).sendKeys("ddhf12");
        driver.findElement(By.name("login")).click();

        //click on forgot password
        //driver.findElement(By.linkText("Forgot password?")).click();

        //driver.findElement(By.partialLinkText("Forgot ")).click();
    }
}
