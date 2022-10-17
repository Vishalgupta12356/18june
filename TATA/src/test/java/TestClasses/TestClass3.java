package TestClasses;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test(groups  ="regression1")
	public void TC01() {
		System.out.println("TestClass3Test01");
	}
	
	@Test(groups  ="regression2")
	public void TC02() {
		System.out.println("TestClass3Test02");
	}

	@Test
	public void TC03() {
		System.out.println("TestClass3Test03");
	}
}
