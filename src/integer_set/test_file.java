package integer_set;

import java.util.ArrayList;

public class test_file {
	
	//this is my second commit
	//this is my second commit
    
    public static void main(String[] args) throws IntegerSetException {
    	//this is my second commit
    	//this is my second commit
    	//this is my second commit
    	//this is my second commit
        
        
        
        // make 2 instance of integerset class for implementation
        integerSet set1= new integerSet();
        integerSet set2= new integerSet();
        
        
        
        //fills the two objects sset
        
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        set1.add(3);
        set1.add(8);
        set1.add(7);
        
        set1.add(10);
        set1.add(12);
        
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        
        //checks the content
        System.out.println("Set 1 : "+set1.toString());
        System.out.println("Set 2 : "+set2.toString());
        
        //union and intersection of set 1 and 2
        
        
        
        
        //checks the equality
        System.out.println("Equal ? "+set1.equals(set2));
        
        
        //checks the difference
        System.out.println("Difference : "+set1.diff(set2));
        
        //remove the differences
        set1.remove(8);
        set1.remove(12);
        set1.remove(10);
        set1.remove(12);
        set2.remove(2);
        set2.remove(5);
        
        
        //checks the content
        System.out.println("Set 1 : "+set1.toString());
        System.out.println("Set 2 : "+set2.toString());
        
        
        //checks the equality
        System.out.println("Equal ? "+set1.equals(set2));
        
        
        //checks the difference
        System.out.println("Difference : "+set1.diff(set2));
        
        
        //clear set 1 and check if it is empty
        
        set1.clear();
        System.out.println("Set 1 : "+set1.toString());
        
        System.out.println("is set1 empty? "+set1.isEmpty());
        
        
        //tries to get largest and then smallest but throws error
        
        
        
        try {
            System.out.println("Largest num of Set 1 : "+set1.largest());
            
        }
        catch(IntegerSetException ex){
            System.out.println("No largest value");
        }
        
        try {
            System.out.println("Smallest num of Set 1 : "+set1.smallest());
            
        }
        catch(IntegerSetException ex){
            System.out.println("No smallest value");
            
        }
        
        
        //gets the smallest and largest value for set 2
        
        try {
            System.out.println("Largest num of Set 2 : "+set2.largest());
            
        }
        catch(IntegerSetException ex){
            System.out.println("No largest value");
        }
        
        try {
            System.out.println("Smallest num of Set 2 : "+set2.smallest());
            
        }
        catch(IntegerSetException ex){
            System.out.println("No smallest value");
            
        }
        
        set1.clear();
        set2.clear();
        
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        set1.add(3);
        set1.add(8);
        set1.add(7);
        
        set1.add(10);
        set1.add(12);
        
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        
        //checks the content
        System.out.println("Set 1 : "+set1.toString());
        System.out.println("Set 2 : "+set2.toString());
        
        //union and intersection of set 1 and 2
        
        set1.union(set2);
        System.out.println("Set 1 and 2 union :"+set1.toString());
        System.out.println("Set2 and 1 intersection : "+(set2.intersect(set1)).toString());
        
        
        
        
        
        
    }
    
    
    
}