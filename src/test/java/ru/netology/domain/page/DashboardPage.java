package ru.netology.domain.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement dashBoardHeading = $$("h2[data-test-id=\"dashboard\"]").first();

    public void checkIfVisible() {
        dashBoardHeading.shouldBe(Condition.visible);
    }
}