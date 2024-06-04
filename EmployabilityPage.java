package GL.DeftRank.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class EmployabilityPage {
	
	WebDriver driver;
	public EmployabilityPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
@FindBy(xpath="//div[@class='d-flex justify-content-between align-items-center p-3 cursor-pointer hover-bg-snow transistion-25'][2]")

WebElement jobarrow;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[1]/div/div[3]/div[1]/div/div")

WebElement jobtoggle;
@FindBy(xpath="//input[@placeholder='Select Start Date']")
WebElement sdate;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[1]/div/div[3]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[5]/td[4]/button")
WebElement selectdate;
@FindBy (xpath="//input[@placeholder='Collage NOC']")
WebElement cnoc;
@FindBy(xpath="//li[text() = 'Yes']")
WebElement dropdownnoc ;
@FindBy(xpath="//input[@placeholder='CTC Amount']")
WebElement ctc;
@FindBy(xpath="//li[text() = '5 Lacs']")
WebElement dropdownct;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[1]/div/div[3]/div[3]/div[2]/div/input")
WebElement loc;
@FindBy(xpath="//li[text() = 'Noida']")
WebElement dropdownloc ;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[2]/div/button[2]")
WebElement savenext;
@FindBy(xpath="//button[contains(text(),'Skip')]")
WebElement skip;

public void employabilitypage() {
	//jobarrow.click();
	/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='p-3 fade-in'][2]")));
	jobtoggle.click();
	sdate.click();
	selectdate.click();
	cnoc.click();
	dropdownnoc.click();
	ctc.click();
	dropdownct.click();
	loc.click();
	dropdownloc.click();
	savenext.click();   */
  //  jobtoggle.isDisplayed();
	//jobtoggle.click();
	skip.click();
}
}
//*[@id="root"]/div[2]/div[2]/div/div/div/form/div[1]/div/div[2]/div[1]/div/div

//*[@id="root"]/div[2]/div[2]/div/div/div/form/div[1]/div/div[3]/div[2]/div[1]/div/input