package org.howard.edu;

public class EmptyListException extends Exception {
	
	EmptyListException(){
		super("List is of size 0.");
		System.out.println("List is of size 0.");
	}

}
