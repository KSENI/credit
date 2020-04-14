package pages.applications;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;

public class ApplicationsPage extends BaseHelper {
    public ApplicationsPage(WebDriver driver) {
        super(driver);
    }

    public int getMaximumCreatedId() {
        return Integer.parseInt(driver.findElement(ApplicationsLocators.maximumId)
                .getText().substring(2));
    }
}
