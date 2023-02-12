import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinAsSpecialistTest {

    @Test(priority = 1)
    public void verifyJoinAsSpecialistIsDisplayed() {
        Assert.assertTrue(HomePOM.getJoinAsSpecialistButton().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyClickingJoinAsSpecialistOpensTheForm() {
        HomePOM.getJoinAsSpecialistButton().click();
        Assert.assertTrue(JoinFormPOM.getJoinForm().isDisplayed());
    }

    @Test(priority = 3)
    public void verifyClickingJoinAsSpecialistOpensTheFormjhg() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(JoinFormPOM.getNameField()));
        JoinFormPOM.getNameField().sendKeys(TestData.NewSpecialistData.name);
        JoinFormPOM.getMobileField().sendKeys(TestData.NewSpecialistData.mobile);
        JoinFormPOM.getAcademicDegreeField().sendKeys(TestData.NewSpecialistData.academicDegree);
        JoinFormPOM.getSpecialityField().sendKeys(TestData.NewSpecialistData.specialization);
        JoinFormPOM.getYearsOfExperienceField().sendKeys(TestData.NewSpecialistData.yearsOfExperience);
        JoinFormPOM.getSocialAccountField().sendKeys(TestData.NewSpecialistData.socialAccount);
        JoinFormPOM.getSendFormButtontField().click();
        Setup.wait.until(ExpectedConditions.visibilityOf(JoinFormPOM.getSuccessLabel()));
        Assert.assertEquals(JoinFormPOM.getSuccessLabel().getText(), TestData.NewSpecialistData.successMessage);
    }


}
