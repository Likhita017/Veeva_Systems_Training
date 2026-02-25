package seleniumwebdriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;
import java.util.*;

public class question2_browser {
	
	public static void main(String args[])
	{
			WebDriver driver;
			System.out.println("Enter browser name");
			Scanner sc=new Scanner(System.in);
			String browser=sc.next().toLowerCase();
			if(browser.equals("chrome"))
				driver=new ChromeDriver();
			else if(browser.equals("edge"))
				driver=new EdgeDriver();
			else if(browser.equals("safari"))
				driver=new SafariDriver();
			else if(browser.equals("firefox"))
				driver=new FirefoxDriver();
			else
				System.out.print("Invalid browser name");
	}

}
