package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Dyanamic_table {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver(); //Showing 1 to 10 of 1649 (165 Pages)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/index.php?route=customer/customer&user_token=9f5a34ec16fcb77d7a1542804fa72592");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        String page=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
       String pages=page.substring(page.indexOf('(')+1,page.lastIndexOf(" "));
       int pag=Integer.parseInt(pages);
       for(int i=2;i<=20;i++)
       {
driver.findElement(By.xpath("//ul[@class='pagination']//li[@class='page-item active']"));
List<WebElement> key=driver.findElements(By.xpath("//tbody/tr/td[2]"));
List<WebElement> value=driver.findElements(By.xpath("//tbody/tr/td[3]"));
System.out.println(key.size() + " " + value.size());
           WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
           WebElement ele=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='page-item']//a[text()='"+i+"']")));
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("arguments[0].click();",ele);


       }

    }

}
