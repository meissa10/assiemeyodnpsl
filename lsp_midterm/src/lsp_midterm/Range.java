package lsp_midterm;

/*
 * A Range represents an integer range, such as
 * 1-10 or 50701-50799. The lower and upper bounds of
 * a Range are given at the time the object is created.
 */
public class Range {
    private int lower;
    private int upper;

    public Range(int lower, int upper) {  // Constructor
        this.lower = lower;
	   this.upper = upper;
    }

    // Returns true if value is >= lower bound and <= upper bound
    public boolean contains( int value ) {
    	if( value >=lower && value <=upper) {
    		return true;
    	}
    	
    	return false;
    };

    /*
     * Returns true if the receive contains at least one value in
     * common with the other, and false otherwise.
     */
    public boolean overlaps( Range other ) {
    	if(other.lower >= lower && other.lower<=upper) {
    		return true;
    	}
    	else if(  lower >= other.lower && lower<= other.upper) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    };
    
    // Returns the number of integers in the range
    public int size() {
    	if(upper>lower) {
    		return (upper-lower+1);
    	}
    	else if(upper == lower) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    	
    };
    // returns the number of integers in the range
}

