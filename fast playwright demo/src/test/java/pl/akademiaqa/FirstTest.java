import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.BaseTest;

public class FirstTest extends BaseTest {
    @Test
    void firstTest() {
        page.navigate("https://www.onet.pl/");
        System.out.println(page.title());
        Assertions.assertThat(page.title()).isEqualTo("Onet – Jesteś na bieżąco");
    }
}