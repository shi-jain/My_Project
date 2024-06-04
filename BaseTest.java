package GL.DftRank.TestComponents;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GL.DeftRank.pageobjects.SigninPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	SigninPage sp;
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")
				+"/src/main/java/GL/DeftRank/Resources/globalData.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//firefox
		}
		
	
	else if(browserName.equalsIgnoreCase("edge")) {
		//edge
}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
	}
	@BeforeMethod(alwaysRun=true)
	public SigninPage launchApplication() throws IOException {
		driver=initializeDriver();
		sp=new SigninPage(driver);
		sp.goTo();
		return sp;
		
	}
	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
	//	driver.close();
	}
}
