package aafanasyevaa.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step ("Открыть главную страницу профиля на Github")
    public void openProfile() {
        open("https://github.com/aafanasyevaa");
    }

    @Step ("Найти репозиторий {repository}")
    public void findRepository(String repository) {
        $(byText(repository)).click();
    }

    @Step ("Проверить наличие таба Issues")
    public void findTabIssues() {
        $(".js-repo-nav").shouldHave(text("Issues"));
    }
}
