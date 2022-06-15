package com.kunal.testUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CircleAreaTest {
	CircleArea ob;
	
	
	@BeforeEach
	void init() {
		ob=new CircleArea();
	}
//	@AfterEach
//	void cleanup() {
//		System.out.println("Cleaning up ....");
//	}

	@Test
	@DisplayName("Testing circleArea Method")
	void test() {
		//fail("Not yet implemented");
		//CircleArea ob=new CircleArea();
		assertEquals(78.5,ob.circleArea(5),"test should return 78.5");
	}
	@Test
	void divide() {
		//CircleArea ob1=new CircleArea();
		assertThrows(ArithmeticException.class,()->ob.divide(3, 0),"It should throw ArithmeticException");
		
	}
	
	@Test
	@DisplayName("Testing multiply method")
    void testMultiply() {
		assertAll(
				     ()->assertEquals(4,ob.multiply(2,2)),
				     ()->assertEquals(4,ob.multiply(1,4))
			   	 );
	}
	@Test
	@Disabled
	@DisplayName("this method should not run")
	void testDesabled(){
		fail("This test method is desabled");
	}
}
