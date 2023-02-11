
package testsCase;

import org.testng.annotations.Test;

import com.xpandit.testng.annotations.Xray;

import org.testng.annotations.Test;

public class Addition extends Division{

	@Test
	@Xray(test = "MATH-12")
	public void afficher1() {
		System.out.println("Ceci est un test avec XRAY 1...");
	}
	
	@Test
	@Xray(test = "MATH-13")
	public void afficher2() {
		System.out.println("Ceci est un test avec XRAY 2...");
	}
}
