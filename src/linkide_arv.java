import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class linkide_arv {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//Herstin//Desktop//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rik.ee/");
        List <WebElement>link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        for (WebElement l : link) {

            System.out.println(l.getText());

        }

    }
}