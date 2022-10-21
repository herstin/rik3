
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//Herstin//Desktop//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ariregister.rik.ee/auth/aup?lang=est");
        driver.findElement(By.id("username")).sendKeys("Mari");
        driver.findElement(By.id("password")).sendKeys("Parool123");
        driver.findElement(By.id("kc-login")).click();
    }
}