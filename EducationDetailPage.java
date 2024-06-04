package GL.DeftRank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationDetailPage {
	WebDriver driver;
	public EducationDetailPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	WebElement board ;
	@FindBy(xpath="//li[text() = 'UP']")
	WebElement dropdownboard ;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]/div/div[4]/div/div/input")
	WebElement year;
	@FindBy(xpath="//li[text() = '2021']")
	WebElement dropdownyear ;
	@FindBy(xpath="//input[@title='Percentage']")
	WebElement percentage ;	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[3]/div/button[2]")
	WebElement savenext;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/form/div[3]/div/button[1]")
	WebElement skip;
	
	
	public void educationDetail() {
	board.click();
	dropdownboard.click();
	percentage.clear();
	percentage.sendKeys("67.7");
	year.click();
	dropdownyear.click();
	//skip.click();
	savenext.click();
	
}
}
