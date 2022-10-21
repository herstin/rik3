import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class otsi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//Herstin//Desktop//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rik.ee/");
        driver.findElement(By.id("edit-search-block-form--2")).sendKeys("ettevõtja");
        driver.findElement(By.id("edit-submit")).click();

        driver.close();
    }
}
