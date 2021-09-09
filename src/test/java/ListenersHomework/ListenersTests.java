package ListenersHomework;
import org.testng.*;
import org.testng.ISuite;
import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.List;

//Write your own implementation of ITestListener methods - onTestSuccess,onTestFailure,onTestSkipped and onTestFailedButWithinSuccessPercentage
public class ListenersTests implements ITestListener,ISuiteListener {
    List<ITestNGMethod> passedtests = new ArrayList<ITestNGMethod>();
    List<ITestNGMethod> failedtests = new ArrayList<ITestNGMethod>();
    List<ITestNGMethod> skippedtests = new ArrayList<ITestNGMethod>();

    public void onTestSuccess(ITestResult arg0){
        System.out.println("Passed test... " + arg0.getName());
        //add the passed tests to the passed list
        passedtests.add(arg0.getMethod());
        System.out.println("Number of passed tests is: " + passedtests.size());
    }


    public void onTestFailure(ITestResult arg0){
        System.out.println("Failed test... " + arg0.getName());
        //add the failed tests to the failed list
        failedtests.add(arg0.getMethod());
        System.out.println("Number of failed tests is: " + failedtests.size());
    }


    public void onTestSkipped(ITestResult arg0){
        System.out.println("Skipped test... " + arg0.getName());
        //add the skipped tests to the skipped list
        skippedtests.add(arg0.getMethod());
        System.out.println("Number of skipped tests is: " + skippedtests.size());
    }


    public void onTestFailedButWithinSuccess(ITestResult arg0){
        System.out.println("onTestFailedButWithinSuccess test... " + arg0.getName());
    }


    //Write your own implementation of ISuiteListener methods
    @Override
    public void onStart(ISuite suite) {
        // When <suite> tag starts
        System.out.println("onStart: before suite starts " + suite.getName());

    }

    @Override
    public void onFinish(ISuite suite) {
        // When <suite> tag completes
        System.out.println("onFinish: after suite completes " + suite.getName());
    }

}
