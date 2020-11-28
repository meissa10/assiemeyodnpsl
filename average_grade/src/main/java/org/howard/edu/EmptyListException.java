package org.howard.edu;


/**
 * is thrown when there  is an empty list of grades
 * @author meissandoye
 *
 */
public class EmptyListException extends Exception {
	
	EmptyListException(){
		super("List is of size 0.");
		
	}

}
