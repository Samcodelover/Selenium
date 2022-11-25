package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //        get the radio button Male
                WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        //        check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
        //        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);
        //check weather the radioButton male is Enables
        boolean enableStatus=maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :"+enableStatus);
        //
        boolean selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :"+selectStatus);

        if(!selectStatus){
            maleRadioBtn.click();
        }
        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :"+selectStatus);
    }
}

