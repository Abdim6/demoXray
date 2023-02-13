
package testsCase;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xpandit.testng.annotations.Xray;

import org.testng.annotations.Test;

public class Addition1 extends Division{

	@Test
	@Xray(test = "MATH-12")
	public void afficher1() {
		System.out.println("Ceci est un test avec XRAY 1...");
//		Assert.assertEquals(false, false);
		Assert.assertTrue(true);
	}

	@Test
	@Xray(test = "MATH-13")
	public void afficher2() {
		System.out.println("Ceci est un test avec XRAY 2...");
		Assert.assertEquals(true, true);
	}
	@Test
	@Xray(test = "MATH-14")
	public void afficher3() {
		System.out.println("Ceci est un test avec XRAY 3...");
		Assert.assertEquals(true, true);
	}
	@Test
	@Xray(test = "MATH-27")
	public void afficher4() {
		System.out.println("Ceci est un test avec XRAY 3...");
		Assert.assertEquals(true, true);
	}

}
