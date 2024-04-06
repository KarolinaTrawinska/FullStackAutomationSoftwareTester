package pl.akademiaqa;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class AllBrowserTest extends BaseTest {
    @Test
    void should_return_correct_page_title_chromium() {

        page.navigate("https://whatismybrowser.com/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/chromium.png")));
    }

    @Test
    void should_return_correct_page_title_firefox() {

        page.navigate("https://whatismybrowser.com/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/firefox.png")));
    }

    @Test
    void should_return_correct_page_title_webkit() {

        page.navigate("https://whatismybrowser.com/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/webkit.png")));
    }
}