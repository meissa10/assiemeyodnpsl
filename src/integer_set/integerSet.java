package integer_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class integerSet {
    
    
    
    
    private  List<Integer>  set = new ArrayList<Integer>();
    
    
    public void clear() {
        set.clear();
    }
    
    public void add(int num) {
        
        for(int i=0;i<set.size();i++) {
            if(set.get(i)==num) {
                return;
            }
            
        }
        set.add(num);
    }
    
    public void remove(int num) {
        
        
        
        for(int i=0;i<set.size();i++) {
            if(set.get(i)==num) {
                set.remove(set.get(i));
                break;
            }
            
        }
        
    }
    
    public int length() {
        return set.size();
    }
    
    public boolean equals( integerSet b) {
        if(b.set.size()!=set.size()) {
            return false;
        }
        
        Collections.sort(set);
        Collections.sort(b.set);
        
        for(int i=0;  i<set.size(); i++){
            
            if(b.set.get(i) != set.get(i)) {
                return false;
            }
            
        }
        return true;
    }
    
    public boolean contains( int num) {
        for(int i=0;  i<set.size(); i++){
            if(set.get(i) == num) {
                return true;
            }
            
        }
        return false;
        
    }
    
    public int largest() throws IntegerSetException {
        
        if(set.size()==0) {
            
            
            
            
            IntegerSetException e =new IntegerSetException();
            throw e;
            
            
        }
        
        int max=0;
        
        for(int i=0;i<set.size();i++) {
            if(set.get(i)>max) {
                max=set.get(i);
            }
        }
        
        return max;
        
    }
    
    public int smallest() throws IntegerSetException {
        
        if(set.size()==0) {
            
            IntegerSetException e =new IntegerSetException();
            throw e;
            
            
        }
        
        int min= set.get(0);
        
        for(int i=0;i<set.size();i++) {
            if(set.get(i)<min) {
                min=set.get(i);
            }
        }
        
        return min;
        
    }
    
    
    
    public  void  union(integerSet list2) {
        
        ArrayList<Integer> temp = null;
        
        for(int i: list2.set) {
            set.add(i);
        }
        
        
        
        Collections.sort(set);
        
        for(int i=0; i<set.size()-2;i++) {
            for(int j=i+1; j<set.size();j++) {
                if(set.get(i) == set.get(j)) {
                    set.remove(set.get(j));
                    break;
                }
            }
        }
        
        
        
        
        
        
    }
    
    public integerSet intersect(integerSet list2) {
        
        
        integerSet list4 =new integerSet();
        if (list2.length()==0 || set.size()==0) {
            return list4;
        }
        
        for(int i:set) {
            for(int a:list2.set) {
                if(i==a) {
                    list4.add(a);
                    break;
                }
            }
            
        }
        
        
        
        return list4;
        
        
        
    }
    
    
    boolean isEmpty() {
        if(set.size()==0) {
            return true;
        }
        return false;
    }
    
    
    
    public String toString() {
        String statement="";
        for(int i: set) {
            statement=statement + i+' ';
        }
        return statement;
    }
    
    
    
    public  integerSet diff(integerSet list2) {
        integerSet list3 = new integerSet();
        
        boolean exist=false;
        
        for(int i: set) {
            for(int a :list2.set) {
                if(i==a) {
                    exist=true;
                    break;
                }
                
            }
            if(exist==false) {
                list3.add(i);
            }
            exist=false;
            
        }
        
        for(int i: list2.set) {
            for(int a :set) {
                if(i==a) {
                    exist=true;
                    break;
                }
                
            }
            if(exist==false) {
                list3.add(i);
            }
            exist=false;
            
        }
        return list3;
    }
    
    
    
}