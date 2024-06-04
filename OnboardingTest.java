package GL.DeftRank.test;

import org.testng.annotations.Test;

import GL.DeftRank.pageobjects.EducationDetailPage;
import GL.DeftRank.pageobjects.EmployabilityPage;
import GL.DeftRank.pageobjects.PersonalDetailPage;
import GL.DeftRank.pageobjects.SigninPage;
import GL.DftRank.TestComponents.BaseTest;
@Test
class OnboardingTest extends BaseTest{
	public void onBoarding() throws InterruptedException {
		SigninPage sp=new SigninPage(driver);
		sp.loginApplication();
		PersonalDetailPage pdp=new PersonalDetailPage(driver);
		pdp.personaldetail();
		EducationDetailPage edp=new EducationDetailPage(driver);
		edp.educationDetail();
		EmployabilityPage ep=new EmployabilityPage(driver);
		ep.employabilitypage();
	}

}

//*[@id="root"]/div[2]/div[2]/div/div/div/form/div[1]/div/div[2]