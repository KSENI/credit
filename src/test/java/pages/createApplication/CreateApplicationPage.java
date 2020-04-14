package pages.createApplication;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.applications.ApplicationsPage;

import java.io.File;

public class CreateApplicationPage extends BaseHelper {
    public CreateApplicationPage(WebDriver driver) {
        super(driver);
    }
    public void fillForm() {
        click(CreateApplicationLocators.createApplicationBy);
        type(CreateApplicationLocators.nameAndSurnameBy, "Иванов Георгий Георгиевич");
        click(CreateApplicationLocators.nameAndSurnameInDropDownBy);
        type(CreateApplicationLocators.telBy, "1234567890");
        type(CreateApplicationLocators.emailBy, "fsdfsdf@dfsdf.cd");
        type(CreateApplicationLocators.sumBy, "300000");
        type(CreateApplicationLocators.durationBy, "23");
        click(CreateApplicationLocators.targetDropDownBy);
        click(CreateApplicationLocators.targetBuyPropertyBy);
        type(CreateApplicationLocators.commentBy, "комментарий");
        type(CreateApplicationLocators.photoBy, new File(".").getAbsolutePath() + "/appartment_sample.jpg");
        click(CreateApplicationLocators.saveApplicationBy);
    }

    public String getInfoText() {
        return driver.findElement(CreateApplicationLocators.informationTextBy).getText();
    }

    public void closeInfo() {
        click(CreateApplicationLocators.informationCloseBy);
    }

    public ApplicationsPage openApplicationsPage() {
        open("https://test.partner.credit.club/applications");
        return new ApplicationsPage(driver);
    }
}
