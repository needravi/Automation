package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Result implements ITestListener,IAutoConst {
	
	public static int  passcount=0,failcount=0;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		passcount++;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failcount++;
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Utility.writeResulttoXL(SUMMARY_PATH, passcount, failcount);
		
	}

}
