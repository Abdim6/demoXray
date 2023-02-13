/**
 * Objectif de cette classe : 
 * Date de création : 
 */
package testsCase;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.xpandit.testng.annotations.Xray;

/** 
 * Vu dans Tuto Pavan Kumar  vidéo 39
 * Crée 3 méthodes Test, avec des cas différents passe, failed and skip
 * avec un listener 
 * avec un rapport 
 * avec parallel
 */
public class Substraction2 {
	@Test
	@Xray(test = "MATH-33")
	public void afficher1() {
		System.out.println("Ceci est un test Soustraction avec XRAY 10 ...");
		Assert.assertEquals(true, false);
	}

	@Test
	@Xray(test = "MATH-34")
	public void afficher3() {
		System.out.println("Ceci est un test Soustraction avec XRAY 11...");
		Assert.assertEquals(true, true);
		
	}
	@Test
	@Xray(test = "MATH-35")
	public void afficher4() {
		System.out.println("Ceci est un test Soustraction avec XRAY 11...");
		Assert.assertEquals(true, true);
		
	}
	@Test
	@Xray(test = "MATH-36")
	public void afficher5() {
		System.out.println("Ceci est un test Soustraction avec XRAY 11...");
		Assert.assertEquals(true, false);
		
	}
	@Test(dependsOnMethods = "afficher1")
	@Xray(test = "MATH-39")
	public void afficher6() {
		System.out.println("Ceci est un test Soustraction avec XRAY 11...");
		Assert.assertEquals(true, true);
		
	}

}
