package com.openclassrooms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testAjouter() {
		HelloWorld testHelloWorld = new HelloWorld();
		int somme = testHelloWorld.sommeNombres(2, 3);
		assertEquals(5, somme);

		// fail("Not yet implemented");
	}

}
