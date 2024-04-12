package Page_object;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {
public static void main(String[] args)
{

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("");
}
}
