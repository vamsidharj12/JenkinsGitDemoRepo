package Automation.AWCTeamCenter;


	import io.github.bonigarcia.wdm.WebDriverManager;

	import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

	@Test
	public class JenkinsGitDemoTest {
		
		public void test1 () throws InterruptedException, MalformedURLException {
			
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setBrowserName("chrome");
			URL url = new URL("http://localhost:4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url,dc);	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Logged into the application");
		Thread.sleep(5000);
		String title = driver.getTitle();
		assertEquals(title,"Swag Labs");
		System.out.println("Test 1 is completed");
		driver.quit();

	    }
		
		public void test2 () throws InterruptedException,MalformedURLException {
			
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setBrowserName("chrome");
			URL url = new URL("http://localhost:4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			System.out.println("Logged into the application");
			Thread.sleep(5000);
			String title = driver.getTitle();
			assertEquals(title,"Swag Labs");
			System.out.println("Test 2 is completed");
			driver.quit();

		    }
	public void test3 () throws InterruptedException ,MalformedURLException {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			System.out.println("Logged into the application\n");
			Thread.sleep(5000);
			String title = driver.getTitle();
			assertEquals(title,"Swag Labs");
			System.out.println("Test 3 is completed");
			driver.quit();

		    }
	
	public void test4 () throws InterruptedException ,MalformedURLException {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Logged into the application");
		Thread.sleep(5000);
		String title = driver.getTitle();
		assertEquals(title,"Swag Labs");
		System.out.println("Test 4 is completed");
		driver.quit();

	    }
	
	public void test5 () throws InterruptedException ,MalformedURLException {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Logged into the application");
		Thread.sleep(5000);
		String title = driver.getTitle();
		assertEquals(title,"Swag Labs");
		System.out.println("Test 5 is completed");
		driver.quit();

	    }


	}
