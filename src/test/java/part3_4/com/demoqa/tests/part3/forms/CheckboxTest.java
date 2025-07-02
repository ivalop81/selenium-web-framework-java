package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckBox();
        formsPage.clickReadingCheckBox();
        formsPage.clickMusicCheckBox();
        formsPage.unclickReadingCheckBox();

        boolean readingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(readingCheckboxSelected,
                "\n Reading Checkbox is selected \n");
    }
}
