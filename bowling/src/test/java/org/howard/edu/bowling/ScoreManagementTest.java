package org.howard.edu.bowling;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;

public class ScoreManagementTest {
	
	private ScoreManagement game1 = new ScoreManagement("X-X-X-X-X-X-X-X-X-XXX");
	private ScoreManagement game2 = new ScoreManagement("45-54-36-27-09-63-81-18-90-72");
	private ScoreManagement game3 = new ScoreManagement("5/-5/-5/-5/-5/-5/-5/-5/-5/-5/5");
	
	private ScoreManagement game4 = new ScoreManagement("X-X-X-X-X-X-X-X-X-X-XXX");
	private ScoreManagement game5 = new ScoreManagement("45-54-36-27-09-63-81-18-92-72");
	private ScoreManagement game6 = new ScoreManagement("5/-5/-5/-5/-5/-5/-5/-5/-57-5/-5-5");
	
	/**
	 * This test tests if the function gives the correct score based on the input
	 */
	@Test
	void testGet_score() {
		assertEquals(300, game1.get_score());
		assertEquals(90, game2.get_score());
		assertEquals(150, game3.get_score());
	}
	
	/**
	 * Checks for the validity  of the input
	 * game 4 has one extra frame
	 * game 5's 9th frame adds up to 11
	 * game 6 has one extra frame and the 8th frame adds up to 12
	 */
	@Test
	void testcheckInput() { 
		assertTrue(game1.checkInput());
		assertTrue(game2.checkInput());
		assertTrue(game3.checkInput());
		assertFalse(game4.checkInput());
		assertFalse(game5.checkInput());
		assertFalse(game6.checkInput());
	}
	
	
	

}
