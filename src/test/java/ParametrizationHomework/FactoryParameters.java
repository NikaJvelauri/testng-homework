package ParametrizationHomework;

import org.testng.annotations.Factory;

public class FactoryParameters {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new FactoryTest("Nika","Jvelauri","//*[@id='genterWrapper']/div[2]/div[1]/label","555555555"),
                new FactoryTest("Name","LastName","//*[@id='genterWrapper']/div[2]/div[1]/label" ,"512323233"),
                new FactoryTest("Saxeli","Gvari","//*[@id='genterWrapper']/div[2]/div[1]/label" ,"5789898989")
        };
    }
}
