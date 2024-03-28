package TestCases;

import org.testng.annotations.Test;

import Pages.BaseTest;

public class TestCaseDemo extends BaseTest {
	@SuppressWarnings("unused")
	@Test
	void testCheck()
	{
		BaseTest obj=new BaseTest();
		String username="locked_out_user";
		String password="secret_sauce";
	}

}
