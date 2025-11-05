import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatePageTitle {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        String expectedTitle = "Google";

        Assert.assertEquals("Page doesn't match Title", actualTitle, expectedTitle);

    }
}
