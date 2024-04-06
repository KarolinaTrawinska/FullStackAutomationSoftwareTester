package pl.akademiaqa;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    //adnotacja rozpoczynająca test
    @Test
    void firstTest() {
        // 1. Należy otworzyć obiekt playwrighta - metoda create
        Playwright playwright = Playwright.create();
        // 2. Przypisanie przeglądarki i otworzenie jej.Domyślnie nie widizmy przeglądarki ponieważ test ma być szybki. Aby
        //  ją zobaczyć musimy użyć metody LounchOptions, w której powiemy że chcemy zobaczyć otwierającą się przeglądarkę
        //  i ma to trwać 1000ms. Używa się tego przy ćwiczeniach, w normalnych testach, nie żeby zaoszczędzić czas
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        // 3. Strona internetowa - tworzymy obiekt page i mając ten obiekt możemy otworzyć stronę w przeglądarce
        Page page = browser.newPage();
        // 4. Przypisanie obiektowi page stronę internetową za pomocą metody navigate
        page.navigate("https://www.onet.pl/");
        // 5. Wyświetlenie tytułu strony
        System.out.println(page.title());
        //  6. Asercja tytułu strony
        Assertions.assertThat(page.title()).isEqualTo("Onet – Jesteś na bieżąco");

    }
}
