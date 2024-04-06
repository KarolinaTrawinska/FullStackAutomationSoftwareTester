package pl.akademiaqa;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest extends BaseTest {
    @Test
    void firstTest() {
        page.navigate("https://www.onet.pl/");
        System.out.println(page.title());
        Assertions.assertThat(page.title()).isEqualTo("Onet – Jesteś na bieżąco");
    }
}
