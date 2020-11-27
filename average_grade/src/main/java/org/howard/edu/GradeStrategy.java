package org.howard.edu;

import java.util.List;


/**
 * This is the interface that  is going to be implemented  by two other classes
 * It  will help us have two ways of  computing  grades
 * @author meissandoye
 *
 */
public interface GradeStrategy {
	public int compute(List<Integer> arr)  throws EmptyListException ;
	
}
