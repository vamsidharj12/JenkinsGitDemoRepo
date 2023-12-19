package Automation.AWCTeamCenter;


	import io.github.bonigarcia.wdm.WebDriverManager;

	import static org.testng.Assert.assertEquals;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	@Test
	public class JenkinsGitDemoTest {
		
		public void test1 () throws InterruptedException {
			
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.print("Logged into the application");
		Thread.sleep(5000);
		String title = driver.getTitle();
		assertEquals(title,"Swag Labs");
		driver.quit();

	}
	}
