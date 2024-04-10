package pl.akademiaqa;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.BaseTest;

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