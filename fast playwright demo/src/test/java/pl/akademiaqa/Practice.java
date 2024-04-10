package pl.akademiaqa;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class Practice extends BaseTest {
    void createPage(BrowserType browserType) {
        browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        context = browser.newContext();
        page = context.newPage();
    }

    void runAndTakeScreenshot(String imagePath) {
        page.navigate("https://www.onet.pl/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(imagePath)));
    }

    @Test
    void should_open_in_chromium() {
        BrowserType browserType = pw.chromium();
        createPage(browserType);
        runAndTakeScreenshot("screenshots/chromium2.png");
    }

    @Test
    void should_open_in_firefox() {
        BrowserType browserType = pw.firefox();
        createPage(browserType);
        runAndTakeScreenshot("screenshots/firefox2.png");
    }

    @Test
    void should_open_in_webkit() {
        BrowserType browserType = pw.webkit();
        createPage(browserType);
        runAndTakeScreenshot("screenshots/webkit2.png");
    }
}
