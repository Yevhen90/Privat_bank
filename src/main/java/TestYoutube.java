import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYoutube {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("2");
        searchBox.submit();
//        driver.quit();

    }

}
