package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTests extends BaseTest {

    @Test
    public void testDatePicker() {
        var dateMenuPage = homePage.goToWidgets().clickSelectMenu();
        dateMenuPage.clickDatePicker().selectMonth("July");
        dateMenuPage.clickDatePicker().selectYear("2025");
        dateMenuPage.clickDatePicker().clickDay("11");
        dateMenuPage.clickDatePicker().clickSelectedDate();

    }
}
