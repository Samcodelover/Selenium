package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //find the webElement button
        WebElement btn =driver.findElement((By.cssSelector("button#buttoncheck")));
        //get the text from the btn webElement
        String text=btn.getText();
        //print it on console
        System.out.println(text);

        //get the value of the attribute "id" from this WebElement
        String idValue=btn.getAttribute("id");
        //
        System.out.println(idValue);
    }
}
