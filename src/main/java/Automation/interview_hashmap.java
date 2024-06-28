package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class interview_hashmap {
    public static void main(String args[])
    {
       // WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testpages.eviltester.com/styled/tag/table.html");
        List<WebElement> keys=driver.findElements(By.xpath("//tbody//tr/td[1]"));
        List<WebElement> values=driver.findElements(By.xpath("//tbody//tr/td[2]"));
        LinkedHashMap<String,Float> hs=new LinkedHashMap<>();
        for(int i=0;i<keys.size();i++)
        {
            hs.put(keys.get(i).getText(),Float.parseFloat( values.get(i).getText()));

        }
        for(String i:hs.keySet())
        {
            System.out.println("key:" +" " +i +" " +"value:" +" " +hs.get(i));
        }

    }

}
