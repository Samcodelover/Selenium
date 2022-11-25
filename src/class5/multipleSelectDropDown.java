package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select=new Select(dropDown);

        //select.selectByIndex(1);
        List<WebElement> list=select.getOptions();
        for (int i = 0; i < list.size(); i++) {

            select.selectByIndex(i);
        }
        select.deselectAll();

        //how can I check the dropDown multi select or not?

        boolean multiSelect = select.isMultiple();
        System.out.println(multiSelect);
    }
}
