package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.applications.ApplicationsPage;
import pages.createApplication.CreateApplicationPage;
import pages.login.LoginPage;

public class Tests extends BaseTest {

    @Test
    public void haveNotificationTextTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("9196884718", "pas1234567");

        CreateApplicationPage createApplicationPage = new CreateApplicationPage(driver);
        createApplicationPage.fillForm();

        String actualText = createApplicationPage.getInfoText();
        String expectedText = "Ваша заявка обрабатывается, скоро она появится в списке заявок";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void haveNewApplicationTest() {
        LoginPage loginPage = new LoginPage(driver);
        ApplicationsPage applicationsPage = loginPage.login("9196884718", "pas1234567");
        int lastCreatedId = applicationsPage.getMaximumCreatedId();

        CreateApplicationPage createApplicationPage = new CreateApplicationPage(driver);
        createApplicationPage.fillForm();
        createApplicationPage.closeInfo(); //если не закрыть будет UnhandledAlertException: unexpected alert open: {Alert text : }

        createApplicationPage.openApplicationsPage();
        int newLastCreatedId = applicationsPage.getMaximumCreatedId();
        Assert.assertEquals(lastCreatedId + 1, newLastCreatedId);
    }
}

