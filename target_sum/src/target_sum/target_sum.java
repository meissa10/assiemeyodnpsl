package target_sum;

import java.util.*;
public class target_sum {
    public target_sum(int target_sum, int nums[]) {
        Vector v = new Vector();
        
        //////////////////////////
        for(int i=0;i<nums.length;i++) {
            
            for(int a=i+1;a<nums.length;a++) {
                int total=0;
                total+=nums[i];
                Vector m= new Vector();
                m.add(i);
                total+=nums[a];
                m.add(a);
                if(total!=target_sum) {
                    total-=nums[a];
                    m.remove(1);
                }
                else {
                    
                    
                    v.add(m);
                    
                    
                    
                }
            }
        }
        
        
        /////////////////////////
        for(int i=0;i<nums.length;i++) {
            
            
            int total=0;
            total+=nums[i];
            Vector m= new Vector();
            m.add(i);
            
            if(total==target_sum) {
                v.add(m);
                total=0;
                break;
            }
            else {
                for(int a=i+1;a<nums.length;a++) {
                    
                    
                    
                    
                    total+=nums[a];
                    
                    m.add(a);
                    
                    if(total==target_sum) {
                        v.add(m);
                        break;
                    }
                    
                    else if(total>target_sum) {
                        
                        m.remove(m.size()-1);
                        total-=nums[a];
                    }
                    
                    
                    
                }
                
            }
            
        }
        System.out.println(v);
    }
    
}