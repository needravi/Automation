package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.Home_Page;
import page.Login_Page;

	public class TestDemo2 extends BaseTest {
		
		@Test
		public void test() {
		Login_Page lp = new Login_Page(driver); 
		String sheet = "Testloginlogout";
		String user = Utility.getXLData(INPUT_PATH, sheet, 1, 0);//2nd row (1)
		lp.setusername(user);
		Reporter.log(user,true);
		String pw = Utility.getXLData(INPUT_PATH, sheet, 1, 1);
		lp.setpassword(pw);
		Reporter.log(pw,true);//to check the data
		lp.clicklogin();
		Reporter.log("Successfully Loged-In as Admin",true);
		Home_Page l = new Home_Page(driver);
		l.welcome();
		Utility.sleep(1000);
		l.logoutbtn();
		Reporter.log("Logout Successfully",true);
				
		}
		/*@Test
		public void ul() {
			Login_Page lp = new Login_Page(driver); 
			String user = Utility.getXLData(INPUT_PATH, "sheet1", 2, 1);
			lp.setusername(user);
			String pw = Utility.getXLData(INPUT_PATH, "sheet1", 2, 1);
			lp.setpassword(pw);
			lp.clicklogin();
			Reporter.log("Successfully Loged-In as User",true);
		}
		*/
	}
