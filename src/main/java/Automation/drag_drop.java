package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class drag_drop {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
//WebDriverManager.chromedriver().setup();
        Actions ac = new Actions(driver);
        WebElement src = driver.findElement(By.xpath("//div[@class='drags']//div[@class='drag left']"));
        WebElement trg = driver.findElement(By.xpath("//div[@class='drops']//div[@id='droppable1']"));
        ac.dragAndDrop(src,trg).perform();
//        if (driver.getPageSource().contains("Dropped!")) {
//System.out.println("Successfully dropped");
//        }
//        else
//        {
//            System.out.println("Not Successfully dropped");
//        }


    }
}