import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.AssertionMode.SOFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class ConfigTests {

    @BeforeClass
    public void configarution3() {
        Configuration.startMaximized = true;
        Configuration.savePageSource = false;
        Configuration.assertionMode = SOFT;
    }
}
