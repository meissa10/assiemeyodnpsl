package org.howard.edu.person;

import java.io.*;
import java.util.*;


 
//hTODO: Auto-generated Javadoc

/**
 * 
 * @author meissandoye
 *
 */
public class Person implements Comparable<Person> {
	
    private String name;
    private int age;
    
    /**
     * 
     * @param name
     * @param age
     */
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    /**
     * 
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws  
     * 
     */
    
	public static List<Person> readPersons  (String fileName) throws FileNotFoundException {
        
        List<Person> list_person=new ArrayList<Person>();
        
        
        
            
            File file = new File(fileName);
            
            
            if(file.exists()==false) {
            	FileNotFoundException e= new FileNotFoundException();
            	throw e;
           
            }
            
            Scanner sc = new Scanner(file);
            
            	
            	while(sc.hasNextLine()){  
                    
                    String line = sc.nextLine();
                    
                    String[] reading_line = line.split(",");
                    
                    
                    String name = reading_line[0];
                    
                    
                    Double age = Double.parseDouble(reading_line[1]);
                    
                    int  age_2= (int)Math.round(age);
                    Person person = new Person(name,age_2);
                    
                    
                    list_person.add(person);
                }
                
                sc.close(); 
            
         
        return list_person;
    }
    
    /**
     * @param o
     * @return true || false
     */
    @Override 
    public boolean equals(Object o) { 
  
        Person temp_person = (Person) o; 
          
        if(temp_person.age==this.age  && temp_person.name==this.name) {
        	return true;
        }
       
        else {
        	return false;
        }
    }
    
    
    
    /**
     * @return string
     */
    
    @Override
    public String toString() { 
        
        return name+" "+age;
    }
    
    
    
    @Override
    /**
     * 
     * @param p2
     * @return
     */
    public int compareTo(Person p2){
    	return Integer.compare(age, p2.age);
    }

}
