package GL.DeftRank.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {
	WebDriver driver;
	public SigninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	
	
	public void loginApplication() throws InterruptedException {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.name("email")).sendKeys("teststudent@yopmail.com");
		driver.findElement(By.xpath("//input[@name='tnc']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> otp=driver.findElements(By.cssSelector(".mx-3"));
		otp.get(0).sendKeys("1");
		otp.get(1).sendKeys("1");
		otp.get(2).sendKeys("1");
		otp.get(3).sendKeys("1");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div/div[1]/div/div/div[3]/button")).click();
		
		//btn btn-light btn btn-primary otp_submit w-100  
		//@class='btn btn-light btn btn-primary otp_submit w-100'
	
		//BasicdetailPage bd=new BasicdetailPage(driver);
		//bd.basicdetail();
		
	}	
	public void goTo() {
		driver.get("https://stage.dr.gopherslab.com/");
	}

}
