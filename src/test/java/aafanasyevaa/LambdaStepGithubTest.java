package aafanasyevaa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepGithubTest {

    private static final String REPOSITORY = "AllureReports";

    @Test
    public void LambdaStepGithubTest() {
        step("Open the main page of GitHub Profile", () -> {
            open("https://github.com/aafanasyevaa");
        });
        step("Find the repository " + REPOSITORY, () -> {
            $(byText(REPOSITORY)).click();
        });
        step("Check whether the Issues tab is presented", () -> {
            $(".js-repo-nav").shouldHave(text("Issues"));
        });
    }
}
