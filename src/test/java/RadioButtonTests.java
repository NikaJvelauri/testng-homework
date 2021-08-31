import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class, SoftAsserts.class})
public class RadioButtonTests {


    @BeforeClass
    public void screens(){
        Configuration.reportsFolder="C:\\Users\\ninja\\IdeaProjects\\TestNG homework\\build\\reports\\tests\\RadioButtonFailedTests";
    }




    @BeforeTest
    @Test
    public void openBrowser1(){
        open("https://demoqa.com/radio-button");
    }

    @Test
    public void selectYes(){
        open("https://demoqa.com/radio-button");
        $(By.xpath("//*[@class = 'custom-control-label']")).click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(5,6);
        softAssert.assertAll();
    }

    @Test
    public void selectNo() throws InterruptedException {
        $(By.xpath("//*[@class = 'custom-control-label disabled']")).click();
        $(By.xpath("//*[@class = 'custom-control-label disabled']")).shouldBe(Condition.checked);

    }
}
