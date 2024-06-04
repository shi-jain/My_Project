package GL.DeftRank.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasicdetailPage {
	WebDriver driver;
	public BasicdetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//input[@name='firstname']")
	WebElement fn;

	@FindBy(xpath ="//input[@name='lastname']")
	WebElement ln;
	@FindBy(xpath ="//input[@name='mobile']")
	WebElement mbl;
	@FindBy(xpath="//input[@placeholder='Choose Course']")
	WebElement course;
	@FindBy(xpath="//input[@placeholder='Pursuing semester']")
		WebElement sem;
	@FindBy(xpath="//input[@placeholder='Choose College']")
	WebElement college;
	@FindBy(xpath ="//p[@class='fw-bold text-primary cursor-pointer hover-underline mb-0 f-14 float-end']")
	WebElement verify;
	@FindBy(css = ".mx-3")
	List<WebElement> otp;
	@FindBy(xpath =("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/button"))
	WebElement otpverify;
	@FindBy(xpath ="//*[@id=\"Bachelor of Science\"]" )
	WebElement dropdowncourse;		
	@FindBy(xpath="//li[text() = '4']")
	WebElement dropdownsem;
	@FindBy(xpath="//*[@id=\"JP University, Noida\"]")
	WebElement dropdowncollege;
	@FindBy(xpath="//button[@type='submit']")
	WebElement savenext;

	//List<WebElement> otp=driver.findElements(By.cssSelector(".mx-3"));
	
	
	public void basicdetail() throws InterruptedException{
		fn.sendKeys("Shikha");
		   ln.sendKeys("Jain");
		   mbl.sendKeys("9999988888");
		   verify.click();
		   otp.get(0).sendKeys("1");
			otp.get(1).sendKeys("1");
			otp.get(2).sendKeys("1");
			otp.get(3).sendKeys("1");
			otpverify.click();
		   course.click();
		   dropdowncourse.click();
		   sem.click();
		   dropdownsem.click();
		   college.click();
		   dropdowncollege.click();
		   
		   
		   
		 savenext.click();
		   //System.out.println(select.getFirstSelectedOption().getText());
		   //select.selectByVisibleText("Bachelor of Science");
	
		   //select1.selectByVisibleText("5");
			
		   
	}
	
	

}
