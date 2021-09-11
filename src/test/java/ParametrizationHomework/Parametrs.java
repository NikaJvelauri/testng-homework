package ParametrizationHomework;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Parametrs {


    @Test
    @Parameters({"firstName","lastName","mobileNumber","Gender"})
    public void practiceForm(String firstName, String lastName, String mobileNumber, String Gender){
        //Navigate to the https://demoqa.com/automation-practice-form
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
        $(By.xpath("//*[@id='firstName']")).sendKeys(firstName);
        $(By.xpath("//*[@id='lastName']")).sendKeys(lastName);
        $(By.xpath(Gender)).click();
        $(By.xpath("//*[@id='userNumber']")).sendKeys(mobileNumber);
        //Validate the Student Name value dynamically
        System.out.println("Student name and lastname: " + firstName + " " + lastName);


    }
}
