import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        driver.manage().window().maximize();


        //Relative XPATH--Recommended
        WebElement relXpath = driver.findElement(By.xpath("//div[@id = 'menu']//a[1]"));


//        Absoulute xpath-->not recommended--starting from html page
        WebElement abXpath = driver.findElement(By.xpath(""));





    }
}
