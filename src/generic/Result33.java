package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result33  implements ITestListener,IAutoConst33{
	static int passCount=0,failCount=0;
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Pass ",true);
		passCount++;
	}
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Fail",true);
		failCount++;
		
	}
	public void onFinish(ITestContext context) {
		Reporter.log("Pass:"+passCount,true);
		Reporter.log("Fail:"+failCount,true);
		Utility33.writeResultToXL(RES_PATH,passCount,failCount);
	}
	//update only above mentioned 3 methods & keep all the other methods as it is 
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
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
}
