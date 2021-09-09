import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.SoftAsserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Configuration.baseUrl;



@Listeners({ScreenShooter.class, SoftAsserts.class})

public class CheckboxTests extends ConfigTests {

    @BeforeTest(groups = {"FrontEnd"})
    @Override
    public void configarution3(){
        Configuration.reportsFolder="src/main/resources/CheckboxFailedTests";
        super.configarution3();
    }


    @BeforeMethod(groups = {"FrontEnd"})
    public void webOpen(){
        baseUrl = "http://the-internet.herokuapp.com/checkboxes";
        open("http://the-internet.herokuapp.com/checkboxes");

    }

    //Add CheckboxTests and RadioButtonTests first method to 'FrontEnd' group and second to 'BackEnd'
    @Test(groups = {"FrontEnd"})
    public void uncheck() {
//        open("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = $(By.xpath("//*[@id='checkboxes']/input[2]"));
        checkbox.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertAll();

    }
    //Add CheckboxTests and RadioButtonTests first method to 'FrontEnd' group and second to 'BackEnd'
    //Change CheckboxTests methods, make one method dependent on other
    //Dependent method should not be blocked,if the main method fails
    @Test(dependsOnMethods = {"uncheck"},alwaysRun=true,groups = {"BackEnd"})
    public void check() {
//        open("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox2 = $(By.xpath("//*[@id='checkboxes']/input[2]"));
        checkbox2.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(3,4);
        softAssert.assertAll();
    }

}
