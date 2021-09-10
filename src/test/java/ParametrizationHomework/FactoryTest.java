package ParametrizationHomework;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class FactoryTest
{
    public String FirstName = "";
    public String LastName = "";
    public String MobileNumber = "";

    public FactoryTest(String firstName,String lastName,String mobileNumber) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.MobileNumber = mobileNumber;
    }




    @Test
    public void factoryTest(){
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
        $(By.xpath("//*[@id='firstName']")).sendKeys(FirstName);
        $(By.xpath("//*[@id='lastName']")).sendKeys(LastName);
        $(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label")).click();
        $(By.xpath("//*[@id='userNumber']")).sendKeys(MobileNumber);

        System.out.println("Student Firstname: " + FirstName );
        System.out.println("Student Lastname: " + LastName );
    }


}



