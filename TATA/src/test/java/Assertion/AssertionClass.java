package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClass {

	String expurl = "www.google.com";
	String acturl = "www.google.com";
	String acturl2 = "www.facebook.com";
	SoftAssert soft = new SoftAssert();
	@Test
	public void TC01() {
		Assert.assertEquals(acturl, expurl);
		System.out.println("Assertion1");
		Assert.assertEquals(acturl, acturl2);
		System.out.println("Assertion2");
		Assert.assertEquals(acturl, acturl);
		System.out.println("Assertion3");
	}
			@ Test
			public void TC02() {
				
				soft.assertEquals(acturl, expurl);
				System.out.println("Assertion A");
				soft.assertEquals(acturl, acturl2);
				System.out.println("Assertion B");
				soft.assertEquals(acturl, expurl);
				System.out.println("Assertion C");
				soft.assertAll();
				
			}
}
