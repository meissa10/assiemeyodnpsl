package org.howard.edu;

import java.util.*;


/**
 * 
 * @author meissandoye
 *
 *this class is an implementation of the Average_computation_strategy.
 * It contains a function that compute the average of all the grades in a list
 *
 */
public class StandardGradeStrategy implements GradeStrategy {
	
	/**
	 * this function takes a vector of numbers and returns there average
	 */
	public int compute(List<Integer> arr) throws EmptyListException{
		if(arr.size()<=0) {
			EmptyListException e  =new EmptyListException();
			
			throw e;
		}
		else {
			int average = 0;
		
			for(int x : arr) {
			average+=x;
			}
		
			average= average/(arr.size());
			return average;
		}
		
	}

}
