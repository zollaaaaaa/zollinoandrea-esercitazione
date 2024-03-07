import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test() {
		Trapezio q = new Trapezio(3, 2, 1, 4);
		float r=q.area();
		float r1=2.5f;
		assertEquals (r1, r);
		System.out.println(r);
	}
	
	@Test	void test1() {
		Trapezio q	 = new Trapezio(6, 5, 5, 4);
		float r=q.area();
		float r1=27.5f;
		assertEquals (r1, r);
		System.out.println(r);
	}
	
	@Test	
	void test2() {
		Trapezio q = new Trapezio(32, 5, 1, 4);
		float r=q.area();
		float r1=18.5f;
		assertEquals (r1, r);
		System.out.println(r);
	}
	

}
