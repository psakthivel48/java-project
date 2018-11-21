package qsp;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter28 {
	@Parameters({"city","area"})
@Test
		public void testA(@Optional("Delhi")String c,@Optional("market")String a){
		Reporter.log(c+a, true);
	}
}
