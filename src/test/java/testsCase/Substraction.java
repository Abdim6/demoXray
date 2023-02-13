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
public class Substraction {
	@Test
	@Xray(test = "MATH-10")
	public void afficher1() {
		System.out.println("Ceci est un test Soustraction avec XRAY 10 ...");
	}

	@Test
	@Xray(test = "MATH-11")
	public void afficher2() {
		System.out.println("Ceci est un test Soustraction avec XRAY 11...");
		
	}
}
