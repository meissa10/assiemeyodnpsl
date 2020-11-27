package org.howard.edu;

import java.util.*;



/**
 * 
 * @author meissandoye
 *
 *this class is an implementation of the Average_computation_strategy.
 * It contains a function that compute the average of all the grades in a list after dropping
 * the two  lowest grade
 *
 */

public class DropTwoLowestGradeStrategy implements GradeStrategy {
	
	/**
	 * this function takes a vector of numbers, drops the two lowest  grades
	 *  and returns there average of the new vector with the two lowest grades dropped
	 */
	public int compute(List<Integer> arr)  throws EmptyListException {
		
		
		if(arr.size()<=0) {
			EmptyListException e  =new EmptyListException();
			
			throw e;
		}
			
		
		else {
			Collections.sort(arr);
			int average = 0;
			
			arr.remove(0);
			arr.remove(0);
			
			for(int x : arr) {
				average+=x;
			}
			
			average= average/(arr.size());
			return average;
		}
		
	}

}
