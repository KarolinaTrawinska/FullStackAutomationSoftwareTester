package pl.akademiaqa;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static Playwright pw;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;


    @BeforeAll
    static void beforeAll() {
        pw = Playwright.create();
    }

    @AfterEach
    void afterEach() {
        context.close();
    }

    @AfterAll
    static void afterAll() {
        pw.close();
    }
}