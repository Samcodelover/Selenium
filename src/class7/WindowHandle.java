package class7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();

        //get the window Handle for the current page
        String gmailHandle=driver.getWindowHandle();
        System.out.println(gmailHandle);
    }
}
