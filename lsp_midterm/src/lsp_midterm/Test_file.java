package lsp_midterm;

import java.util.*;

public class Test_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Testing class Range and its different methods
		Range m =  new Range(5,10);
		Range e =  new Range(1,5);
		Range i =  new Range(1,4);
		Range s =  new Range(100,1000);
		
		System.out.println("Range m contains 6:"+ m.contains(6));
		System.out.println("Range m contains 10:"+ m.contains(10));
		System.out.println("Range m contains 15:"+ m.contains(15));
		System.out.println("Range s contains 10000:"+ m.contains(10000));
		
		
		System.out.println("Range m and Range e overlap:"+ m.overlaps(e));
		System.out.println("Range m and Range i overlap:"+ m.overlaps(i));
		System.out.println("Range e and Range m overlap:"+ e.overlaps(m));
		
		System.out.println("The size of Range m is:"+ m.size());
		System.out.println("The size of Range e is:"+ e.size());
		System.out.println("The size of Range i is:"+ i.size());
		System.out.println("The size of Range s is:"+ s.size());
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		// Testing the SongsDatabase class and its different methods.
		SongsDatabase playlist= new SongsDatabase();
		

		playlist.addSong("Rap","The Box");
		playlist.addSong("Rap","Paranoia");
		playlist.addSong("French Soul","Jaloux");
		playlist.addSong("French Soul","Dieu Merci");
		playlist.addSong("Soul","All of me");
		playlist.addSong("Afro","No stress");
		playlist.addSong("Afro","Ye");
		playlist.addSong("Afro","Level Up");

        
        Set<String> set = playlist.getSongs("Afro");
        
        
        
        
        
        System.out.println("Afro Songs:");
        
        Iterator it = set.iterator();
        
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("French Soul:");
        
        
        set = playlist.getSongs("French Soul");
        
        it = set.iterator();
        
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("");
        
        

        System.out.println("Genre of Jaloux : "+ playlist.getGenreOfSong("Jaloux"));
        
        
        System.out.println("The genre of Paranoia is a "+ playlist.getGenreOfSong("Paranoia")+" song.");
		
		
		

	}

}
