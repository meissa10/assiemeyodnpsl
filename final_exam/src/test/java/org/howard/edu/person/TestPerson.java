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
		
		
		List<Person> operation= p1.readPersons("csvFile1.txt");
		
		assertEquals(operation.get(0).getName(), "Fred Smith");
		assertEquals(operation.get(0).getAge(), 28);

		assertEquals(operation.get(1).getName(), "Jim Brown");
		assertEquals(operation.get(1).getAge(), 33);
		
		assertEquals(operation.get(2).getName(), "Ann Simpson");
		assertEquals(operation.get(2).getAge(), 31);
		
		
		
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
	
	

}
