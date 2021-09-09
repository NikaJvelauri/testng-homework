package ListenersHomework;


import org.testng.*;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




//Create 4 methods with different results- success, failed, skipped and failedWithinSuccessPercentage
@Listeners(ListenersHomework.ListenersTests.class)
public class ListenerMethods implements IAnnotationTransformer, ISuiteListener {
    @Test
    void success() {
        System.out.println("This is Test1");
        Assert.assertEquals("A", "A");
    }

    @Test
    void failed() {
        System.out.println("This is Test2");
        Assert.assertEquals("A", "B");
    }

    @Test
    void skipped() {
        System.out.println("This is Test3");
        throw new SkipException("This is skip exception");
    }

    @Test
        // Using IAnnotationTransformer set disabled to any methods in the Class
    void failedWithinSuccessPercentage1(ITestAnnotation annotation) {
        annotation.setEnabled(false);
        System.out.println("This is Test4");
        Assert.assertEquals("A", "B");
    }



}

