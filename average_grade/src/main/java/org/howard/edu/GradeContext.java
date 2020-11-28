package org.howard.edu;

import java.util.*;

/**
 * define the strategy and compute the average and median if posiible
 * @author meissandoye
 *
 */
public class GradeContext {
	
	private  GradeStrategy strategy;
	
	/**
	 * 
	 * @param strategy
	 * sets the  gradeStrategy
	 */
	public void setGradeStrategy(GradeStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 
	 * @param arr
	 * @return the  average of  the list passed  as  a parameter
	 * @throws EmptyListException
	 */
	public float get_average_grade(List<Integer> arr)  throws EmptyListException {
		
		return strategy.compute(arr);
		
	}
	
	/**
	 * 
	 * @param arr
	 * @return the  median of  the list passed  as  a parameter
	 * @throws EmptyListException
	 */
	public int get_median(List<Integer> arr) throws EmptyListException {
		
		if(arr.size()==0) {
			EmptyListException e  =new EmptyListException();
			throw e;
		}
		else {
			if(arr.size()%2 ==0) {
			return  (arr.get(arr.size()/2)+arr.get((arr.size()/2)-1))/2;
			
		}
		else {
			return arr.get(arr.size()/2);
		}
		}
		
		
	}

}
