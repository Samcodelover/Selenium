package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");

        //driver.manage().window().maximize();
        //Thread.sleep(500);
        driver.manage().window().fullscreen();
        Thread.sleep(600);
        driver.quit();
    }
}
