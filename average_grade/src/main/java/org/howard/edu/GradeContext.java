package org.howard.edu;

import java.util.*;

public class GradeContext {
	
	private  GradeStrategy strategy;
	
	public void setAverage_computation_strategy(GradeStrategy strategy) {
		this.strategy = strategy;
	}
	
	public float get_average_grade(List<Integer> arr)  throws EmptyListException {
		
		return strategy.compute(arr);
		
	}
	
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
