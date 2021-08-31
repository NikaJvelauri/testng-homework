import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static com.codeborne.selenide.AssertionMode.SOFT;



public class ConfigTests {

    @BeforeSuite
    public void configarution3() {
        Configuration.assertionMode = SOFT;
        Configuration.startMaximized = true;
        Configuration.savePageSource=false;
    }


    //All tests should be started with new webdriver instance *
    @AfterSuite
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }


}
