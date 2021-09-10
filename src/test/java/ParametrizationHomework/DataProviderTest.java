package ParametrizationHomework;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DataProviderTest {

    @Test(dataProvider = "FillDataProvider")
    public void dataProvider(String firstName, String lastName, String mobileNumber) {
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
        $(By.xpath("//*[@id='firstName']")).sendKeys(firstName);
        $(By.xpath("//*[@id='lastName']")).sendKeys(lastName);
        $(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label")).click();
        $(By.xpath("//*[@id='userNumber']")).sendKeys(mobileNumber);
        System.out.println("Student Firstname: " + firstName);
        System.out.println("Student Lastname: " + lastName);
    }



    @DataProvider (name = "FillDataProvider")
    public Object[][] dpMethod(){
        return new Object[][] {{"Nika", "Jvelauri", "555555555"}, {"Saxeli", "Gvari", "551121212"}, {"FirstName", "LastName", "555111111"}};
    }
}

