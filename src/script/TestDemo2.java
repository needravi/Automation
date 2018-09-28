package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.Login_Page;


	public class TestDemo2 extends BaseTest {
		
		@Test
		public void test() {
		Login_Page lp = new Login_Page(driver); 
		String user = Utility.getXLData(INPUT_PATH, "sheet1", 1, 0);
		lp.setusername(user);
		String pw = Utility.getXLData(INPUT_PATH, "sheet1", 1, 1);
		lp.setpassword(pw);
		lp.clicklogin();
		Reporter.log("Successfully Loged-In as Admin",true);
		}
		@Test
		public void ul() {
			Login_Page lp = new Login_Page(driver); 
			String user = Utility.getXLData(INPUT_PATH, "sheet1", 2, 1);
			lp.setusername(user);
			String pw = Utility.getXLData(INPUT_PATH, "sheet1", 2, 1);
			lp.setpassword(pw);
			lp.clicklogin();
			Reporter.log("Successfully Loged-In as User",true);
		}
		
	}
