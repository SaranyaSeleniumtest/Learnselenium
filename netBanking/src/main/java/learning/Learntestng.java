package learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learntestng {
	
	public void assertion() {
		SoftAssert softassert= new SoftAssert();
		softassert.assertTrue(false);
		softassert.assertEquals("Testing", "Test");
		softassert.assertEquals("cat", "cat");
		System.out.println("Testcompleted");
		softassert.assertAll();
	}


	@Test(enabled=true)
	public void test001() {
		Assert.assertEquals(true, true);
		System.out.println("Tc001 is passed");
	}
	
	

	@Test
	public void test002() {
		Assert.assertEquals("Test", "Testing", "test mismatch");
		System.out.println("Tc002 is failed");
	}
}
