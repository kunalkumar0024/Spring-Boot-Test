package com.kunal.testUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentControllerTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		StudentController ob= new StudentController();
		int expected=12;
		int actual=ob.add(8, 4);
		assertEquals(expected,actual,"The add() should add two numbers !");
	}

}
