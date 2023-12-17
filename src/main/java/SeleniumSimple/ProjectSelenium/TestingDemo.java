package SeleniumSimple.ProjectSelenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\CDAC\\SDM\\AutomationTesting\\Chromedriver\\chromedriver.exe");
		
		
		System.setProperty("webdriver.chrome.driver","D:\\CDAC\\SDM\\AutomationTesting\\Chromedriver\\chromedriver.exe");

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		//Thread.sleep(1000);
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.className("x4bK8")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("mobile")).sendKeys("9604024184");
		
		/*Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("Harish");
		
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("kuteharish0703@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
		
		System.out.println("Enter the Otp");
		Scanner sc = new Scanner(System.in);
		String otp = sc.next();
		Thread.sleep(5000);
		driver.findElement(By.name("otp")).sendKeys(otp);
		
		Thread.sleep(3000);
		driver.findElement(By.className("a-ayg")).click();*/
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
		Thread.sleep(1000);
		String otp = sc.next();
		
		
		Thread.sleep(1000);
		driver.findElement(By.name("otp")).sendKeys(otp);
		
	}
}
