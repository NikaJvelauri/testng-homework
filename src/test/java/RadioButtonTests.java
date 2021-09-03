import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class, SoftAsserts.class})

public class RadioButtonTests extends ConfigTests {


    @BeforeTest
    @Override
    public void configarution3(){
        Configuration.reportsFolder="src/main/resources/RadioButtonFailedTests";
        super.configarution3();

    }

    @BeforeMethod
    public void webOpen(){
        Configuration.baseUrl = "https://demoqa.com/radio-button";


    }

    //Add CheckboxTests and RadioButtonTests first method to 'FrontEnd' group and second to 'BackEnd'
    //Change RadioButtonTests methods default sequence
    @Test(priority=1,groups = {"FrontEnd"})
    public void selectYes(){
        open("https://demoqa.com/radio-button");
        $(By.xpath("//*[@class = 'custom-control-label']")).click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(5,6);
        softAssert.assertAll();
    }
    //Add CheckboxTests and RadioButtonTests first method to 'FrontEnd' group and second to 'BackEnd'
    //Change RadioButtonTests methods default sequence
    @Test(priority=0, groups = {"BackEnd"})
    public void selectNo(){
        open("https://demoqa.com/radio-button");
        $(By.xpath("//*[@class = 'custom-control-label disabled']")).click();
        $(By.xpath("//*[@class = 'custom-control-label disabled']")).shouldBe(Condition.checked);

    }
    //Create one test method that should fail 5 times
    //Use your annotation with parameter 10
    @Test(retryAnalyzer = RetryTests.class, threadPoolSize = 10, priority = 10)
    public void forRetry(){
        open("https://demoqa.com/radio-button");
        $(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/label")).click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(5,10);
        softAssert.assertAll();
    }
}
