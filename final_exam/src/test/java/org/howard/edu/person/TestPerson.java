package org.howard.edu.person;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 
 * @author meissandoye
 *
 */
class TestPerson {
	
	Person p1 = new Person("Meissa", 20);
	Person p2 = new Person("Meissa", 20);
	Person p3 = new Person("Andre", 15);
	Person p4 = new Person("Fred Smith", 28);
	Person p5 = new Person("Jim Brown", 33);
	Person p6 = new Person("Ann Simpson", 31);
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@Test
	void testEquals() {
		assertTrue(p1.equals(p2));
		assertTrue(p1.equals(p1));
		assertFalse(p1.equals(p3));
	}
	
	
	@Test
	void testreadPersons() throws FileNotFoundException{
		List<Person> expected=new ArrayList<Person>();
		expected.add(p4);
		expected.add(p5);
		expected.add(p6);
		
		
		assertEquals(expected, p1.readPersons("csvFile1.txt"));
		
		
		
		
	}
	
	
	@Test
	void testtoString() {
		
		assertEquals("Meissa 20", p1.toString());
		assertEquals("Meissa 20", p2.toString());
		assertEquals("Andre 15", p3.toString());
		
		
	}
	
	
	
	@Test
	void testreadPersonsException() throws FileNotFoundException{
		

		FileNotFoundException e = assertThrows(
				FileNotFoundException.class, () -> p2.readPersons("csvFile2.txt"));

		
		
	}
	
	@Test
	void testCollectionSorting() throws FileNotFoundException{
		List<Person> expected1=new ArrayList<Person>();
		expected1.add(p4);
		
		expected1.add(p6);
		expected1.add(p5);
		expected1.add(p1);
		Collections.sort(expected1);
		
		List<Person> operation  = p2.readPersons("csvFile1.txt");
		
		operation.add(p1);
		Collections.sort(operation);
		
		assertEquals(expected1, operation);
		
		
	}

}
