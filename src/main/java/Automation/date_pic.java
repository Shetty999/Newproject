package Automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.time.Month;
import java.util.List;

public class date_pic {
    public static void main(String args[])  {

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.automationtesting.in/Datepicker.html");
String expected_date="26";
String expected_month="December";
String expected_year="1995";
driver.findElement(By.xpath("//div[@class='col-xs-4']")).click();
while(true)
{
    String actual_month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
    String actual_year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();
if(expected_month.equalsIgnoreCase(actual_month)&&expected_year.equalsIgnoreCase(actual_year))
{
    break;
}
else {
    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
}
}

List<WebElement>dates=driver.findElements(By.xpath("//tbody/tr/td/a"));
for(int i=0;i<dates.size();i++)
{
    if(dates.get(i).getText().equals(expected_date))
    {
        dates.get(i).click();
    }
}
        }
    }
