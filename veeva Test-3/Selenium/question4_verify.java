package seleniumwebdriver;




import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class question4_verify {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equals("Google"))
			System.out.println("Title is google");
		else
			System.out.println("Title is not google");
		
		if(driver.getCurrentUrl().contains("google.co.in"))
			System.out.println("link is redirected");
		else
			System.out.println("link is not redirected");
		
	}
}
