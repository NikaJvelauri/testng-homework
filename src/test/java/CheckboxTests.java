import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.SoftAsserts;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Listeners({ScreenShooter.class, SoftAsserts.class})
public class CheckboxTests {





    @BeforeClass
    public void screens2(){
        Configuration.reportsFolder="C:\\Users\\ninja\\IdeaProjects\\TestNG homework\\build\\reports\\tests\\CheckboxFailedTests";
    }


    @Test
    @BeforeTest
    public void openBrowser(){
        open("http://the-internet.herokuapp.com/checkboxes");

    }


    @Test
    public void uncheck() {
        open("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = $(By.xpath("//*[@id='checkboxes']/input[2]"));
        checkbox.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertAll();

    }

    @Test
    public void check() {
        WebElement checkbox2 = $(By.xpath("//*[@id='checkboxes']/input[2]"));
        checkbox2.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(3,4);
        softAssert.assertAll();
    }

}
