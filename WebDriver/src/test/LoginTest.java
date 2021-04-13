package test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement email=driver.findElement(By.name("user_login"));
		System.out.println("Enter Custom email id:");
		Scanner sc=new Scanner(System.in);
		String custom=sc.next();
		email.sendKeys(custom);

	}

}
