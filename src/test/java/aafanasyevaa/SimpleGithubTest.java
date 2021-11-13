package aafanasyevaa;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleGithubTest {

    @Test
    @DisplayName("Проверка наличия таба Issues")
    @Owner("aafanasyevaa")
    @Feature("Github")
    @Story("Таб Issues")
    @Severity(SeverityLevel.TRIVIAL)

    public void FirstTest () {
        SelenideLogger.addListener("allure", new AllureSelenide());

    open ("https://github.com/aafanasyevaa");
    $(byText("AllureReports")).click();
    $(".js-repo-nav").shouldHave(text("Issues"));
    }
}
