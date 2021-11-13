package aafanasyevaa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleGithubTest {

    @Test
    public void FirstTest () {

    open ("https://github.com/aafanasyevaa");
    $(byText("AllureReports")).click();
    $(".js-repo-nav").shouldHave(text("Issues"));
    }
}
