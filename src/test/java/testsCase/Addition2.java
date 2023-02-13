
package testsCase;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xpandit.testng.annotations.Xray;

import org.testng.annotations.Test;

public class Addition2 extends Division{


	@Test
	@Xray(test = "MATH-28")
	public void afficher1() {
		System.out.println("Ceci est un test avec XRAY 1...");
		Assert.assertEquals(false, false);
	}

	@Test
	@Xray(test = "MATH-29")
	public void afficher2() {
		System.out.println("Ceci est un test avec XRAY 2...");
		Assert.assertEquals(true, true);
	}
	@Test
	@Xray(test = "MATH-30")
	public void afficher3() {
		System.out.println("Ceci est un test avec XRAY 3...");
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods = "afficher1")
	@Xray(test = "MATH-31")
	public void afficher4() {
		System.out.println("Ceci est un test avec XRAY 3...");
		Assert.assertEquals(true, true);
	}


}
