import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        WebElement userNameFeild = driver.findElement(By.id("username"));

        WebElement userPasswordFeild = driver.findElement(By.id("password"));

        WebElement submitButton = driver.findElement(By.id("submit"));

        userNameFeild.sendKeys("student");
        userPasswordFeild.sendKeys("Password123");
        submitButton.click();








    }
}
