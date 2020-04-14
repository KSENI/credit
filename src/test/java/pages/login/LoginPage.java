package pages.login;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.applications.ApplicationsPage;
import sun.rmi.runtime.Log;

public class LoginPage extends BaseHelper {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public ApplicationsPage login(String telNumber, String password) {
        open("https://test.partner.credit.club/applications");
        type(LoginLocators.telBy, telNumber);
        click(LoginLocators.furtherBy);
        type(LoginLocators.passwordBy,password);
        click(LoginLocators.loginBy);
        return new ApplicationsPage(driver);
    }
}
