package org.howard.edu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


/**
 * This class  tests all the methods of the average_grade project
 * @author meissandoye
 *
 */
class GradeContextTest {
	private GradeContext avg1= new GradeContext();
	private GradeContext avg2= new GradeContext();
	
	private List<Integer>arr=new Vector<Integer>();
	private List<Integer>arr1=new Vector<Integer>();
	private List<Integer>arr2=new Vector<Integer>();
	private List<Integer>arr3=new Vector<Integer>();
	
	
	

	

	@BeforeEach
	void setUp() throws EmptyListException {
		avg1.setGradeStrategy(new StandardGradeStrategy());
		avg2.setGradeStrategy(new DropTwoLowestGradeStrategy());
		arr.add(100);
		arr.add(90);
		arr.add(80);
		arr1.add(100);
		arr1.add(90);
		arr1.add(80);
		arr1.add(70);
		
		arr3.add(60);
		arr3.add(50);
		arr3.add(40);
		arr3.add(30);
	}
	
	
	
	@Test
	
	/**
	 *   tests different scenarios for an empty list
	 * @throws EmptyListException
	 */
	void testget_average_grade_Exception() throws EmptyListException {
		
		
		
		EmptyListException e = assertThrows(
				EmptyListException.class, () -> avg1.get_average_grade(arr2));

		assertEquals("List is of size 0.", e.getMessage());
		
		
		EmptyListException d = assertThrows(
				EmptyListException.class, () -> avg2.get_average_grade(arr2));

		assertEquals("List is of size 0.", d.getMessage());
		
	}
	
	

	@Test
	/**
	 * tries  to  get the average
	 * @throws EmptyListException
	 */
	void testget_average_grade()  throws EmptyListException {
		
		assertEquals(90,avg1.get_average_grade(arr));
		assertEquals(95,avg2.get_average_grade(arr1));
	}
	
	
	/**
	 * tries  to  get the median
	 * @throws EmptyListException
	 */
	@Test
	void testget_median() throws EmptyListException {
		
		assertEquals(90,avg1.get_median(arr));
		assertEquals(45,avg1.get_median(arr3));
		assertEquals(85,avg2.get_median(arr1));
	}
	
	/**
	 * tests different scenarios for an empty list
	 * @throws EmptyListException
	 */
	
	@Test
	
	void testget_median_exception() throws EmptyListException {
		
		EmptyListException e = assertThrows(
				EmptyListException.class, () -> avg1.get_median(arr2));

		assertEquals("List is of size 0.", e.getMessage());
		
		
		EmptyListException d = assertThrows(
				EmptyListException.class, () -> avg2.get_median(arr2));

		assertEquals("List is of size 0.", d.getMessage());
		
		
	}
	
}

