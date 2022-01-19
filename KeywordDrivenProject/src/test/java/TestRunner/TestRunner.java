package TestRunner;

import keywordEngine.KeywordEngine;

public class TestRunner {

	public static void main(String[] args) {
		
		TestBase.TestBase base = new TestBase.TestBase();
		/*
		 * base.execute("open_browser", "NA", "NA", "openbrowser", "chrome");
		 * base.execute("enter_the_url", "NA", "NA", "enterurl",
		 * "https://opensource-demo.orangehrmlive.com/"); base.execute("enter_userName",
		 * "id", "txtUsername", "sendkeys", "Admin"); base.execute("enter_password",
		 * "id", "txtPassword", "sendkeys", "admin123");
		 * base.execute("click_login_Button", "id", "btnLogin", "click", "NA");
		 */
		KeywordEngine ke = new KeywordEngine();
		ke.readData();

	}

}
