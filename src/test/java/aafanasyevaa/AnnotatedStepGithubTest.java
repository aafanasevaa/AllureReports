package aafanasyevaa;

import aafanasyevaa.steps.WebSteps;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotatedStepGithubTest {

    private WebSteps steps = new WebSteps();
    private static final String REPOSITORY = "AllureReports";

    @Test
    @DisplayName("Проверка наличия таба Issues")
    @Owner("aafanasyevaa")
    @Feature("Github")
    @Story("Таб Issues")
    @Severity(SeverityLevel.TRIVIAL)

    public void AnnotatedStepGithubTest () {

    steps.OpenProfile();
    steps.FindRepository(REPOSITORY);
    steps.FindTabIssues();
    }
}
