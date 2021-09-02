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


    //Change RadioButtonTests methods default sequence
    @Test(priority=1)
    public void selectYes(){
        open("https://demoqa.com/radio-button");
        $(By.xpath("//*[@class = 'custom-control-label']")).click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(5,6);
        softAssert.assertAll();
    }
    //Change RadioButtonTests methods default sequence
    @Test(priority=0)
    public void selectNo(){
        open("https://demoqa.com/radio-button");
        $(By.xpath("//*[@class = 'custom-control-label disabled']")).click();
        $(By.xpath("//*[@class = 'custom-control-label disabled']")).shouldBe(Condition.checked);

    }
}
