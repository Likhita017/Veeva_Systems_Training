package seleniumwebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class question1_login {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://sves.org.in/ecap/Default.aspx");
		driver.findElement(By.xpath("//input[@id='txtId2']")).sendKeys("22a81a05q4");
		driver.findElement(By.xpath("//input[@id='txtPwd2']")).sendKeys("Likhi@2005");
		driver.findElement(By.xpath("//input[@id='imgBtn2']")).click();
		Thread.sleep(5000);
		System.out.println("login successful");	
	}
}
