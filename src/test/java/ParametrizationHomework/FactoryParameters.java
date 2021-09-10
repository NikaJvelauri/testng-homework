package ParametrizationHomework;

import org.testng.annotations.Factory;

public class FactoryParameters {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new FactoryTest("Nika","Jvelauri","555555555"),
                new FactoryTest("Name","LastName","512323233"),
                new FactoryTest("Saxeli","Gvari","5789898989")
        };
    }
}
