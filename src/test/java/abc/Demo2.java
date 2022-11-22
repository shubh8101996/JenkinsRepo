package abc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void Test3() {
		
		System.out.println("Test 3");
		
	}
	
	
	@Test
	public void Test4() {
		
		Assert.assertTrue(false);
		System.out.println("Test 4");
		
	}

}
