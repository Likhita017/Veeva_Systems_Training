package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class question3_search {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.amazon.in/");

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")
                )
        );

        search.sendKeys("apple");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.s-suggestion")
        ));

        List<WebElement> l = driver.findElements(
                By.cssSelector("div.s-suggestion")
        );

        for (WebElement i : l) {
            System.out.println(i.getText());
        }

    }
}