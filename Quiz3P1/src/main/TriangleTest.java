package main;

import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void testGetArea() {
		Triangle tester = new Triangle();
		assertTrue("",tester.getArea()==Math.pow(0.1875,0.5)); 
	}

	@Test
	public void testGetPerimeter() {
		Triangle tester = new Triangle();
		assertTrue("",tester.getPerimeter()==3); 
	}

}
