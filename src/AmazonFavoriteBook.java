import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFavoriteBook {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver drive = new ChromeDriver(); //create a webdriver object
        drive.get("https://amazon.com");

        //to submit something on the search box of google;
        // click on inspect to find the web elements locators
       // this is to find by name  WebElement searchBox = drive.findElement(By.name("field-keywords"));
        WebElement byId = drive.findElement((By.id("twotabsearchtextbox")));
        byId.sendKeys("There is simply too much to think about"); //add keys in the text box
        byId.submit(); //
    }
}
