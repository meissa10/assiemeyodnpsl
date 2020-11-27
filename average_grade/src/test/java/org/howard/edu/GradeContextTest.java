package org.howard.edu;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


class GradeContextTest {
	private GradeContext array1= new GradeContext();
	private GradeContext array2= new GradeContext();
	
	private List<Integer>arr=new Vector<Integer>();
	private List<Integer>arr1=new Vector<Integer>();
	private List<Integer>arr2=new Vector<Integer>();
	
	

	

	@BeforeEach
	void setUp() throws EmptyListException {
		array1.setAverage_computation_strategy(new StandardGradeStrategy());
		array2.setAverage_computation_strategy(new DropTwoLowestGradeStrategy());
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr1.add(5);
		arr1.add(10);
		arr1.add(15);
		arr1.add(20);
		arr1.add(25);
		arr1.add(30);
	}
	
	
	
	@Test
	
	void testget_average_grade_Exception() throws EmptyListException {
		
		//array1.get_average_grade(arr2);
		
		EmptyListException e = assertThrows(
				EmptyListException.class, () -> array1.get_average_grade(arr2));

		assertEquals("List is of size 0.", e.getMessage());
		
	}
	
	

	@Test
	void testget_average_grade()  throws EmptyListException {
		
		assertEquals(10,array1.get_average_grade(arr));
		assertEquals(22,array2.get_average_grade(arr1));
	}
	
	@Test
	void testget_median() {
		
		assertEquals(10,array1.get_median(arr));
	}
	
}

