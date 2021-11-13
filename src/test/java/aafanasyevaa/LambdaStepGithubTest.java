package aafanasyevaa;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepGithubTest {

    private static final String REPOSITORY = "AllureReports";

    @Test
    @DisplayName("Проверка наличия таба Issues")
    @Owner("aafanasyevaa")
    @Feature("Github")
    @Story("Таб Issues")
    @Severity(SeverityLevel.TRIVIAL)

    public void LambdaStepGithubTest() {

        step("Открыть главную страницу профиля на Github", () -> {
            open("https://github.com/aafanasyevaa");
        });
        step("Найти репозирорий " + REPOSITORY, () -> {
            $(byText(REPOSITORY)).click();
        });
        step("Проверить наличие таба Issues", () -> {
            $(".js-repo-nav").shouldHave(text("Issues"));
        });
    }
}
