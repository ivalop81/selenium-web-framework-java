package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);
        selectedByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectedByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String  value) {
        scrollToElementJS(standardMultiSelect);
        deselectedByValue(standardMultiSelect, value);
    }

}
