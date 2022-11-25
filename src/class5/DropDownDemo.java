package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select=new Select(dropDown);

        select.selectByIndex(5);
        Thread.sleep(3000);
//        Select by visible text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
//        Select by value
        select.selectByValue("Sunday");
        Thread.sleep(3000);
//        get all options available in the dropDown
        List<WebElement> options=select.getOptions();
//         traverse through the options
        for(int i=0; i<=options.size();i++){
            WebElement option=options.get(i);
            String text=option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }
        }
    }
}
